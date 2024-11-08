package com.example.factorypatterndemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProductEnvironmentConfiguration : NetworkConfiguration {

    override val baseUrl: String
        = "www.baseurl.com"

    override fun createRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

class StateEnvironmentConfiguration : NetworkConfiguration {

    override val baseUrl: String
            = "www.baseurl.stage.com"

    override fun createRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

