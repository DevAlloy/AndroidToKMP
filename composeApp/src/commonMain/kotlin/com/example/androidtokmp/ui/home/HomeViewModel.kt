package com.example.androidtokmp.ui.home

import com.example.androidtokmp.ui.common.BaseViewModel

class HomeViewModel : BaseViewModel<String>() {
    override fun initialState(): String = "Hi! This is home Fragment"
}