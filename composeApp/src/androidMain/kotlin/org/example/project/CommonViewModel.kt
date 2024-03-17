package org.example.project

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CommonViewModel : ViewModel() {
    private val _apiCallFlow: MutableStateFlow<String> = MutableStateFlow("")
    val apiCallFlow = _apiCallFlow.asStateFlow()

    fun apiCalls() {
        _apiCallFlow.value = "ROSHAN"
    }
}