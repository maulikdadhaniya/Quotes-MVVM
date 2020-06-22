package com.example.mvvmdemo.model

import com.google.gson.annotations.SerializedName

data class LoginResponse (

    @SerializedName("isSuccessful")
    var isSuccessful: Boolean,

    @SerializedName("message")
    var message: String,


    @SerializedName("user")
    var user: LoginModel?

)