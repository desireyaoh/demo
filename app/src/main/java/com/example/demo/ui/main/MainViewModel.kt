package com.example.demo.ui.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _helloText = MutableStateFlow("Hello World")
    val helloText: StateFlow<String> = _helloText.asStateFlow()
}
