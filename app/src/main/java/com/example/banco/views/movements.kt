package com.example.banco.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.banco.movements
import com.example.banco.ui.theme.BancoTheme

@Composable
fun Movements(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(textAlign = TextAlign.Center, text = "Movimientos")
        Spacer(modifier = Modifier.size(20.dp))

        Card(
            modifier = Modifier
                .wrapContentSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                items(movements) { item ->
                    Column(modifier = Modifier.padding(0.dp,10.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Card(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .padding(5.dp)
                            ) {
                                Text(item.description, textAlign = TextAlign.Center)
                            }
                            Card(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .padding(5.dp)
                            ) {
                                Text(
                                    item.amount.toString() + " " + item.currency,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth(0.3f)
                                    .padding(5.dp)
                            ) {
                                Text(item.post_date.split("T")[0], textAlign = TextAlign.Center)
                            }
                            Card(
                                modifier = Modifier
                                    //.fillMaxWidth()
                                    .padding(5.dp)
                            ) {
                                Text(item.comment, textAlign = TextAlign.Center)
                            }
                        }
                    }
                }
                }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun MovementsPreview() {
    BancoTheme {
        Movements(rememberNavController())
    }
}