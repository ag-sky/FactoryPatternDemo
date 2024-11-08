package com.example.factorypatterndemo

import retrofit2.Retrofit

interface NetworkConfiguration {

    val baseUrl: String
    fun createRetrofitInstance(): Retrofit
}