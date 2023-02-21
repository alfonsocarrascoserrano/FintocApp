package com.example.fintocapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fintocapp.ShowTopAppBar
import com.example.fintocapp.model.Movement
import com.example.fintocapp.ui.theme.FintocAppTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovDetails(navController: NavController) {

    if(selectedMovement==null) navController.popBackStack()
    val selMov : Movement = selectedMovement!!

    Scaffold(topBar = {
        ShowTopAppBar(navController = navController, name = "Detalle Movimiento") })
    { innerPadding ->
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Spacer(modifier = Modifier.size(20.dp))

            Column() {
                Row() {
                    Text(
                        text = "Fecha",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = selMov.post_date.split("T")[0],
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                Row() {
                    Text(
                        text = "F. transacción",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = ""+if(selMov.transaction_date != null) selMov.transaction_date.split("T")[0] else "",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                Row() {
                    Text(
                        text = "Monto",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = selMov.amount.toString()+" "+selMov.currency,
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                Row() {
                    Text(
                        text = "Descripción",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = selMov.description,
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                Row() {
                    Text(
                        text = "Comentario",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.4f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = ""+if(selMov.comment != null) selMov.comment else "",
                        Modifier
                            .border(1.dp, Color.Black)
                            .weight(0.6f)
                            .padding(8.dp)
                            .height(20.dp)
                    )
                }
                if(selMov.recipient_account!=null){
                    Column(
                        Modifier
                            .border(1.dp, Color.Black)
                            .wrapContentSize()
                            .padding(10.dp,0.dp)) {
                        Text(text = "Receptor")
                        Row() {
                            Text(
                                text = "Cuenta",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.recipient_account.number,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                        Row() {
                            Text(
                                text = "Rut",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.recipient_account.holder_id,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                        Row() {
                            Text(
                                text = "Nombre",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.recipient_account.holder_name,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                        Row() {
                            Text(
                                text = "Banco",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.recipient_account.institution.name,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                    }
                }
                if(selMov.sender_account!=null){
                    Column(
                        Modifier
                            .border(1.dp, Color.Black)
                            .wrapContentSize()
                            .padding(10.dp,0.dp)) {
                        Text(text = "Emisor")
                        Row() {
                            Text(
                                text = "Cuenta",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.sender_account.number,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                        Row() {
                            Text(
                                text = "Rut",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.sender_account.holder_id,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                        Row() {
                            Text(
                                text = "Nombre",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.sender_account.holder_name,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                        Row() {
                            Text(
                                text = "Banco",
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.4f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                            Text(
                                text = selMov.sender_account.institution.name,
                                Modifier
                                    .border(1.dp, Color.Black)
                                    .weight(0.6f)
                                    .padding(8.dp)
                                    .height(20.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovDetailsPreview() {
    FintocAppTheme {
        MovDetails(rememberNavController())
    }
}