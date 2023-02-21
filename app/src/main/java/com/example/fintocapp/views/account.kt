package com.example.fintocapp.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fintocapp.ShowTopAppBar
import com.example.fintocapp.link_token
import com.example.fintocapp.viewModel.AccountViewModel
import com.example.fintocapp.viewModel.MovementViewModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Account(navController: NavController, accindex: Int, accountViewModel: AccountViewModel, movementViewModel: MovementViewModel) {

    val account = accountViewModel.accountListResponse[accindex]
    val listItems = arrayOf("Todos", "Último año", "Últimos 6 meses", "Último mes")

    var selectedItem by remember {
        mutableStateOf(0)
    }

    var expanded by remember {
        mutableStateOf(false)
    }

    ShowTopAppBar(navController = navController, name= account.name)

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Spacer(modifier = Modifier.size(20.dp))

        Column() {
            Row() {
                Text(
                    text = account.official_name + " - " + account.number,
                    Modifier
                        .border(1.dp, Color.Black)
                        .weight(1f)
                        .padding(8.dp)
                        .height(20.dp),
                    textAlign = TextAlign.Center
                )
            }
            Row() {
                Text(
                    text = "Nombre titular",
                    Modifier
                        .border(1.dp, Color.Black)
                        .weight(0.4f)
                        .padding(8.dp)
                        .height(20.dp)
                )
                Text(
                    text = account.holder_name,
                    Modifier
                        .border(1.dp, Color.Black)
                        .weight(0.6f)
                        .padding(8.dp)
                        .height(20.dp)
                )
            }
            Row() {
                Text(
                    text = "Rut titular",
                    Modifier
                        .border(1.dp, Color.Black)
                        .weight(0.4f)
                        .padding(8.dp)
                        .height(20.dp)
                )
                Text(
                    text = account.holder_id,
                    Modifier
                        .border(1.dp, Color.Black)
                        .weight(0.6f)
                        .padding(8.dp)
                        .height(20.dp)
                )
            }
            Column(
                Modifier
                    .border(1.dp, Color.Black)
                    .wrapContentSize()
                    .padding(10.dp,0.dp)) {
                Text(text = "Balance")
                Row() {
                    Text(
                        text = "Disponible",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = account.balance.available.toString(),
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                Row() {
                    Text(
                        text = "Limite",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = account.balance.limit.toString(),
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                Row() {
                    Text(
                        text = "Actual",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = account.balance.current.toString(),
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row() {
                Button(modifier = Modifier.height(55.dp),
                    onClick = {
                        movementViewModel.getMovementList(account.id, link_token)
                        navController.navigate("movements/"+selectedItem.toString())
                    }) {
                    Text("Ver movimientos")
                }
                ExposedDropdownMenuBox(
                    modifier = Modifier.height(55.dp),
                    expanded = expanded,
                    onExpandedChange = {
                        expanded = !expanded
                    }
                ) {

                    TextField(
                        value = listItems[selectedItem],
                        onValueChange = {},
                        readOnly = true,
                        label = { Text(text = "Periodo") },
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(
                                expanded = expanded
                            )
                        },
                        colors = ExposedDropdownMenuDefaults.textFieldColors()
                    )

                    ExposedDropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        listItems.forEachIndexed { index, s ->
                            DropdownMenuItem(onClick = {
                                selectedItem = index
                                expanded = false
                            }) {
                                Text(text = listItems[index])
                            }
                        }
                    }
                }
            }
        }
    }
}



/*@Preview(showBackground = true)
@Composable
fun AccountPreview() {
    BancoTheme {
        Account(rememberNavController())
    }
}*/