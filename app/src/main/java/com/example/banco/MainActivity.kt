package com.example.banco

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.banco.ui.theme.BancoTheme
import com.example.banco.views.*


class MainActivity : ComponentActivity() {
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
                    MyAppNavHost()
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "profile"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") { Login(navController) }
        composable("menu") { Menu(navController) }
        composable("account") { Account(navController) }
        composable("movements/{filter}") { navBackStackEntry ->
            val filter = navBackStackEntry.arguments?.getString("filter")
            filter?.let {
                Movements(navController = navController, filter = it.toInt())
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BancoTheme {
        Login(rememberNavController())
    }
}