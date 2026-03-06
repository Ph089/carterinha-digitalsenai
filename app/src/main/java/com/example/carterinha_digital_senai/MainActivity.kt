package com.example.carterinha_digital_senai


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carterinha_digital_senai.ui.theme.CarterinhadigitalsenaiTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarterinhadigitalsenaiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDeEstudante(modifier = Modifier.padding(innerPadding).fillMaxSize())
                }
            }
        }
    }
}

//diz que a função vai construir algo na tela (retirando o erro de "Column")



    @Preview(
        showBackground = true,
        showSystemUi = true
    )
    @Composable
    fun PreviewCarteirinhaClaro(){
        CarterinhadigitalsenaiTheme(darkTheme = false) {
            CarteirinhaDeEstudante(
                modifier = Modifier.padding(16.dp)
            )
        }
    }
    @Preview(
        showBackground = true,
        showSystemUi = true
    )
    @Composable
    fun PreviewCarteirinhaEscuro(){
        CarterinhadigitalsenaiTheme(darkTheme = true) {
            CarteirinhaDeEstudante(
                modifier = Modifier.padding(16.dp)
            )
        }
    }

