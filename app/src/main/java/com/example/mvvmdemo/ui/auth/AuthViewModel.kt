package com.example.mvvmdemo.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.data.repositories.UserRepository

class AuthViewModel : ViewModel() {

    var authListner: AuthListner? = null

    var email: String? = null
    var password: String? = null

    fun onLoginButtonClickListner(view: View) {


        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            //
            authListner?.onFailer("Invalid Email or Password")
            return
        }


        val loginResponse = UserRepository().userLogin(email!!,password!!)
        authListner!!.onSucess(loginResponse)

    }





}