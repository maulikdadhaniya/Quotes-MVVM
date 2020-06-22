package com.example.mvvmdemo.ui.auth

import androidx.lifecycle.LiveData
import com.example.mvvmdemo.model.LoginResponse

interface AuthListner {
    fun onSucess(loginResponse: LiveData<LoginResponse>)
    fun onFailer(mesage: String)
}