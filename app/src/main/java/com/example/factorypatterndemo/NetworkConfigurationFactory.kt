package com.example.factorypatterndemo

object NetworkConfigurationFactory {
    fun getConfiguration(environment: Environment): NetworkConfiguration{
       return  when(environment) {
            is Environment.Production -> ProductEnvironmentConfiguration()
            is Environment.Stage -> StateEnvironmentConfiguration()
            Environment.Testing -> TODO()
        }
    }
}