package com.example.carterinha_digital_senai.feature.home.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.carterinha_digital_senai.R
import com.example.carterinha_digital_senai.core.designsystem.theme.CarterinhadigitalsenaiTheme
import com.example.carterinha_digital_senai.core.navigation.Routes

@Composable
fun HomeScreen(
    navController: NavController
) {
    HomeContent(
        onNavigateToCarteirinha = {
            navController.navigate(Routes.Carteirinha.route)
        }
    )
}

@Composable
private fun HomeContent(
    onNavigateToCarteirinha: () -> Unit
) {
    CarterinhadigitalsenaiTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MaterialTheme.colorScheme.background
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = onNavigateToCarteirinha,
                    modifier = Modifier.fillMaxWidth(0.7f)
                ) {
                    Text(
                        text = stringResource(id = R.string.home_ver_carteirinha),
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        }
    }
}