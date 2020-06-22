package com.example.mvvmdemo.model

import com.google.gson.annotations.SerializedName

data class LoginModel (

    @SerializedName("id")
    var id: Int,

    @SerializedName("name")
    var name: String,

    @SerializedName("email")
    var email: String

)