package com.example.androidtokmp.ui.common

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<T> : ViewModel() {
    protected val _state = MutableStateFlow<T>(initialState())
    val state: StateFlow<T> = _state.asStateFlow()

    abstract fun initialState(): T
}