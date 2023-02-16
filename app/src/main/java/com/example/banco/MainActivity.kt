package com.example.banco

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.banco.ui.theme.BancoTheme
import com.example.banco.viewModel.AccountViewModel
import com.example.banco.viewModel.MovementViewModel
import com.example.banco.views.*


class MainActivity : ComponentActivity() {

    val accountViewModel by viewModels<AccountViewModel>()
    val movementViewModel by viewModels<MovementViewModel>()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BancoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyAppNavHost(accountViewModel, movementViewModel)
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MyAppNavHost(
    accountViewModel: AccountViewModel,
    movementViewModel: MovementViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "menu"
    ) {
        composable("login") { Login(navController) }
        composable("menu") { Menu(navController, accountViewModel) }
        composable("account/{accindex}") { navBackStackEntry ->
            val accindex = navBackStackEntry.arguments?.getString("accindex")
            accindex?.let {
                Account(navController = navController, accindex = it.toInt(), accountViewModel, movementViewModel)
            }
        }
        composable("movements/{filter}") { navBackStackEntry ->
            val filter = navBackStackEntry.arguments?.getString("filter")
            filter?.let {
                Movements(navController = navController,movementViewModel= movementViewModel , filter = it.toInt())
            }
        }
        composable("movDetails") { MovDetails(navController) }
    }
}

@Composable
internal fun ShowTopAppBar(navController: NavController, name: String) {
    TopAppBar(modifier = Modifier,
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Ir Atrás")
            }
        },
        title = { Text(text = name) },
        actions = {
            //
        }
    )
}

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BancoTheme {
        Login(rememberNavController())
    }
}*/