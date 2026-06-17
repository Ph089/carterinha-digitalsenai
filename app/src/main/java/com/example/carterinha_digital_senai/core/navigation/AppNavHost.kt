package com.example.carterinha_digital_senai.core.navigation


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carterinha_digital_senai.feature.auth.presentation.LoginScreen
import com.example.carterinha_digital_senai.feature.carteirinha.presentetion.screen.CarteirinhaScreen
import com.example.carterinha_digital_senai.feature.home.screen.HomeScreen
import com.example.carterinha_digital_senai.feature.unidadecurricular.domain.model.UnidadeCurricular
import com.example.carterinha_digital_senai.feature.unidadecurricular.presentation.screen.UnidadeCurricularContent

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Login.route) {
            LoginScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController
            )
        }

        composable(Routes.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
                modifier = Modifier
                    .fillMaxSize()
            )
        }

        composable(Routes.UnidadesCurriculares.route) {
            // Lista simulada para testar a navegação e apresentação
            val mockUCs = listOf(
                UnidadeCurricular(
                    id = "1",
                    nome = "Matemática",
                    professor = "João Silva",
                    nota1 = 8.0,
                    nota2 = 7.5,
                    media = 7.75,
                    faltas = 2
                ),
                UnidadeCurricular(
                    id = "2",
                    nome = "Português",
                    professor = "Maria Souza",
                    nota1 = 9.0,
                    nota2 = 8.5,
                    media = 8.75,
                    faltas = 1
                )
            )

            UnidadeCurricularContent(
                unidadesCurriculares = mockUCs,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}