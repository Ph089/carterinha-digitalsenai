package com.example.carterinha_digital_senai


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat
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
@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier){ //nome: tipo, padrao
    Column (modifier, verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(R.drawable.senai_s_o_paulo_logo),
            contentDescription = "logo_senai_sp",
            modifier = Modifier.size(200.dp)

        )

        Image(
           painter = painterResource(R.drawable.img_3359),
            contentDescription = "img_3359",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )
        Row {
            Text(text = "Nome: ",
            style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = "Pedro Henricky Santos Pina da Silva",
                modifier = Modifier.padding(start = 10.dp),
                style = MaterialTheme.typography.bodyLarge
            )

        }
        Row {
            Text(text = "Curso: ",
            style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Desenvolvimento de Sistemas",
                modifier = Modifier.padding(start = 10.dp),
                style = MaterialTheme.typography.bodyLarge
            )

        }
        QrCode(
            conteudo = "vem pro x1 samuel"
        )
    }
}