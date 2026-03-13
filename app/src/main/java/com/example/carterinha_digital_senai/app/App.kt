package com.example.carterinha_digital_senai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carterinha_digital_senai.core.designsystem.theme.CarterinhadigitalsenaiTheme

@Composable
fun App() {
    CarterinhadigitalsenaiTheme {

        val navController = rememberNavController()
    }
}
