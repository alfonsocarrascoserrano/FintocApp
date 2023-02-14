package com.example.banco.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.banco.ui.theme.BancoTheme

@Composable
fun Login(navController: NavController) {
    var user by remember {
        mutableStateOf("Carlos")
    }
    var pwd by remember {
        mutableStateOf("********")
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(text = "Ingresar")
        Spacer(modifier = Modifier.size(50.dp))

        TextField(
            value = user,
            onValueChange = { user = it },
            label = { Text("Usuario") }
        )

        TextField(
            value = pwd,
            onValueChange = { pwd = it },
            label = { Text("Contraseña") }
        )
        Button(onClick = { navController.navigate("menu") }) {
            Text(text = "Login")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    BancoTheme {
        Login(rememberNavController())
    }
}