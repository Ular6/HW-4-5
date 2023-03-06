package com.example.lesson4_5

import android.app.Application

class App : Application() {

    companion object {
        var api: CalculateApi? = null
    }

    override fun onCreate() {
        super.onCreate()
        val retrofit = RetrofitService()
        api = retrofit.getApi()
    }
}