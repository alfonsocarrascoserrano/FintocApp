package com.example.banco.views

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.banco.ShowTopAppBar
import com.example.banco.accounts
import com.example.banco.model.Movement
import com.example.banco.viewModel.MovementViewModel
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

var selectedMovement: Movement? = null

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Movements(navController: NavController, movementViewModel: MovementViewModel, filter: Int) {

    val movements = movementViewModel.movementListResponse

    val column1Weight = .25f
    val column2Weight = .23f
    val column3Weight = .25f
    val column4Weight = .12f

    val listItems = arrayOf("Todos", "Último año", "Últimos 6 meses", "Último mes")

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val current = LocalDate.now()
    var filtered: BooleanArray = BooleanArray(movements.size)

    val balance = Calculate(movements, filtered, formatter, current, filter)

    Scaffold(topBar = {
        ShowTopAppBar(navController = navController, name = "Movimientos") })
    {  innerPadding ->

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (filter > 0) {
                Spacer(modifier = Modifier.size(30.dp))
                Row(modifier = Modifier.wrapContentSize()) {
                    Text(text = "Balance " + listItems[filter] + ": " + balance + " " + accounts[0].currency)
                }
                Spacer(modifier = Modifier.size(20.dp))
            }
            Card(
                modifier = Modifier
                    .wrapContentSize()
            ) {
                LazyColumn(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    item {
                        Row(Modifier.background(Color.LightGray)) {
                            TableCell(text = "Fecha", weight = column1Weight, height = 20)
                            TableCell(text = "Monto", weight = column2Weight, height = 20)
                            TableCell(text = "Descripcion", weight = column3Weight, height = 20)
                            TableCell(text = "Mas", weight = column4Weight, height = 20)
                        }
                    }
                    itemsIndexed(movements) { index, item ->

                        Column(modifier = Modifier) {
                            if (filtered[index]) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    TableCell(
                                        text = item.post_date.split("T")[0],
                                        weight = column1Weight
                                    )
                                    TableCell(
                                        text = item.amount.toString() + " " + item.currency,
                                        weight = column2Weight
                                    )
                                    TableCell(text = item.description, weight = column3Weight)
                                    TextButton(modifier = Modifier
                                        .border(1.dp, Color.Black)
                                        .weight(column4Weight)
                                        .padding(8.dp)
                                        .height(60.dp),
                                        contentPadding = PaddingValues(0.dp),
                                        onClick = {
                                            selectedMovement = item
                                            navController.navigate("movDetails")
                                        }) {
                                            Text("Ver")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float,
    height: Int=60
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color.Black)
            .weight(weight)
            .padding(8.dp)
            .height(height.dp)
    )
}

@RequiresApi(Build.VERSION_CODES.O)
fun Calculate(movements: ArrayList<Movement>, filtered: BooleanArray, formatter: DateTimeFormatter, current:LocalDate, filter: Int): Int {

    var balance = 0

    filtered.forEachIndexed() { index,item ->

        val strmovdate = movements[index].post_date.split("T")[0]
        val stramovdate = movements[index].post_date.split("T")[0].split("-")
        val currentdate = current.toString().split("-")

        val mvdate = listOf<Int>(stramovdate[0].toInt(),stramovdate[1].toInt(),stramovdate[2].toInt())
        val crrntdate = listOf<Int>(currentdate[0].toInt(),currentdate[1].toInt(),currentdate[2].toInt())

        var movdate = LocalDate.parse(strmovdate, formatter)
        val period = Period.between(movdate, current)
        val years = period.years
        val months = period.months
        val days = period.days
        var dif = 0

        if (filter==0){
            filtered[index] = true
        }
        if (filter == 1) {
            if(mvdate[0] == crrntdate[0]-1){
                if(mvdate[1] >= crrntdate[1]){
                    balance += movements[index].amount
                    filtered[index] = true
                }
            }
            if (mvdate[0] == crrntdate[0]){
                balance += movements[index].amount
                filtered[index] = true
            }
        }
        if (filter == 2) {
            if(mvdate[0] == crrntdate[0]-1){
                if(mvdate[1]-6 >= crrntdate[1]){
                    balance += movements[index].amount
                    filtered[index] = true
                }
            }
            if(mvdate[0] == crrntdate[0]){
                if(mvdate[1]+6 >= crrntdate[1]){
                    balance += movements[index].amount
                    filtered[index] = true
                }
            }
        }
        if (filter == 3){
            if(mvdate[0] >= crrntdate[0]-1){
                if((mvdate[0]==crrntdate[0]-1) && mvdate[1]==12) {
                    if (mvdate[2] >= crrntdate[2]) {
                        balance += movements[index].amount
                        filtered[index] = true
                    }
                }
                if(mvdate[0] == crrntdate[0]){
                    if((mvdate[1] == crrntdate[1]-1) && (mvdate[2] >= crrntdate[2])) {
                        balance += movements[index].amount
                        filtered[index] = true
                    }
                    if (mvdate[1] == crrntdate[1]) {
                        balance += movements[index].amount
                        filtered[index] = true
                    }
                }
            }
        }
    }
    return balance
}

/*@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun MovementsPreview() {
    BancoTheme {
        Movements(rememberNavController(), 1)
    }
}*/