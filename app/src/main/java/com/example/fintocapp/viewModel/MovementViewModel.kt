package com.example.fintocapp.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fintocapp.model.Movements
import com.example.mtglifetracker.network.ApiService
import kotlinx.coroutines.launch

class MovementViewModel: ViewModel() {
    var movementListResponse: Movements by mutableStateOf(Movements())
    var errorMessage: String by mutableStateOf("")


    fun getMovementList(accountid: String, link_token: String){
        viewModelScope.launch{
            val apiService = ApiService.getInstance()
            try {
                val movementList = apiService.getMovements(accountid, link_token)
                movementListResponse = movementList
            }
            catch(e:Exception){
                errorMessage = e.message.toString()
            }
        }
    }
}