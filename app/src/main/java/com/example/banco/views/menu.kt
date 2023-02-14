package com.example.banco.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.banco.MyAppNavHost
import com.example.banco.accounts
import com.example.banco.model.Account
import com.example.banco.model.Balance
import com.example.banco.ui.theme.BancoTheme

@Composable
fun Menu(navController: NavController) {//accounts: List<Account>

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Seleccione Producto:")
        Spacer(modifier = Modifier.size(20.dp))

        LazyColumn() {

            items(accounts) { item ->
                Button(modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight(0.05f), onClick = {
                    navController.navigate("movements")
                }) {
                    Text(item.name, textAlign = TextAlign.Center)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    BancoTheme {
        Menu(rememberNavController())
    }
}