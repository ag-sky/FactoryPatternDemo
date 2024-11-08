package com.example.factorypatterndemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun EnvironmentScreen(
    environment: Environment
) {
    val networkConfiguration = NetworkConfigurationFactory.getConfiguration(environment)
    val baseUrl = remember { networkConfiguration.baseUrl }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Environment: ${environment::class.simpleName}")
        Text(text = "Base URL: $baseUrl")
    }
}