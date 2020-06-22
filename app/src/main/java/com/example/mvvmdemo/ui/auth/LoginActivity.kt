package com.example.mvvmdemo.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.ActivityLoginBinding
import com.example.mvvmdemo.model.LoginResponse
import com.example.mvvmdemo.viewutil.toast

class LoginActivity : AppCompatActivity(), AuthListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewmodel = ViewModelProvider.NewInstanceFactory().create(AuthViewModel::class.java)

        binding.viewmodel = viewmodel
        viewmodel.authListner = this
    }


    override fun onSucess(loginResponse: LiveData<LoginResponse>) {
        loginResponse.observe(this@LoginActivity, Observer {
            if (it.isSuccessful) {
                toast(it!!.toString())
            } else {
                toast(it!!.message)
            }

        })
    }

    override fun onFailer(mesage: String) {
        toast(mesage)
    }
}