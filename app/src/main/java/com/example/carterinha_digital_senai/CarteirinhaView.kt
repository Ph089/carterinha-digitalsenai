package com.example.carterinha_digital_senai

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier) { //nome: tipo, padrao
    Box() {
        Image(
            painter = painterResource(R.drawable.ee77bffd24fa4904c5bc2323688dfad1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column(
        modifier,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.senai_s_o_paulo_logo),
            contentDescription = "logo_senai_sp",
            modifier = Modifier.size(300.dp)


        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth(.0f)
                .fillMaxSize(.0f)

        )

        Image(
            painter = painterResource(R.drawable.iaforblankavatarimage),
            contentDescription = "img_3359",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .fillMaxSize(.2f)
                .fillMaxWidth(.6f)


        )

        Spacer(
            modifier = Modifier
                .fillMaxSize(.1f)
                .fillMaxWidth(.1f)
        )

        Row {
            LabelText(
                text = "Nome: ",
                style = MaterialTheme.typography.bodyMedium,
            )

            LabelText(
                text = "Pedro Henricky Santos Pina da Silva", color = Color.White,
                modifier = Modifier.padding(start = 30.dp),
                style = MaterialTheme.typography.bodyLarge
            )

        }
        Row {
            LabelText(
                "Curso: ",
                modifier = Modifier.weight(1f)
            )
            ValueText(
                value =  "Desenvolvimento de Sistemas",
                style = MaterialTheme.typography.bodyLarge
            )


        }
        QrCode(
            conteudo = "vem pro x1 samuel"
        )

    }
}