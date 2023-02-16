package com.example.banco.views

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.banco.link_token
import com.example.banco.viewModel.AccountViewModel

@Composable
fun Menu(navController: NavController, accountViewModel: AccountViewModel) {

    val activity = (LocalContext.current as? Activity)

    accountViewModel.getAccountList(link_token)

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Seleccione Producto de:")
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = if(accountViewModel.accountListResponse.size>0) accountViewModel.accountListResponse[0].holder_name else "")
        Spacer(modifier = Modifier.size(40.dp))

        LazyColumn() {

            itemsIndexed(accountViewModel.accountListResponse) { index,item ->
                Button(modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight(0.05f), onClick = {
                    navController.navigate("account/"+index)
                }) {
                    Text(item.name+" "+item.number, textAlign = TextAlign.Center)
                }
            }
        }
        Spacer(modifier = Modifier.size(30.dp))
        Button(modifier = Modifier.fillMaxWidth(0.8f),
            onClick = {
                activity?.finish() }) {
            Text(text = "Salir")
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    BancoTheme {
        Menu(rememberNavController())
    }
}*/