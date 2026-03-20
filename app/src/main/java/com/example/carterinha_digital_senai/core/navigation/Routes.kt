package com.example.carterinha_digital_senai.core.navigation

sealed class Routes(val route: String) {
    data object Login : Routes("login")
    data object Home : Routes("home")


    data object Carteirinha : Routes("carteirinha")
}