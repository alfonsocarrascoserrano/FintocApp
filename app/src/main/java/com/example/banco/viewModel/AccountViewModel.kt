package com.example.banco.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.banco.model.Account
import com.example.banco.model.Accounts
import com.example.mtglifetracker.network.ApiService
import kotlinx.coroutines.launch

class AccountViewModel: ViewModel() {
    var accountListResponse:Accounts by mutableStateOf(Accounts())
    var errorMessage: String by mutableStateOf("")


    fun getAccountList(link_token: String){
        viewModelScope.launch{
            val apiService = ApiService.getInstance()
            try {
                val accountList = apiService.getAccounts(link_token)
                accountListResponse = accountList
            }
            catch(e:Exception){
                errorMessage = e.message.toString()
            }
        }
    }
}