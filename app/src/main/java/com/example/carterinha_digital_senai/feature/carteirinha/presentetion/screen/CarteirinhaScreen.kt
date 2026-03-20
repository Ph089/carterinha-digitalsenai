package com.example.carterinha_digital_senai.feature.carteirinha.presentetion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carterinha_digital_senai.feature.carteirinha.presentetion.component.LabelText
import com.example.carterinha_digital_senai.R
import com.example.carterinha_digital_senai.feature.carteirinha.presentetion.component.ValueText

import com.rafaelcosta.myapplication.QrCode


@Composable
fun CarteirinhaScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable._0a26aee3cfecc6187d2a403c13c4366),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(.7f)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(.6f)
                    .background(color = Color.Blue)
            )
            Spacer(
                modifier = Modifier
                    .weight(.3f)
            )
            Image(
                painter = painterResource(R.drawable.iaforblankavatarimage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .clip(CircleShape)
                    .aspectRatio(1f)
            )
            Row(
                modifier = Modifier
                    .weight(.2f)
                    .fillMaxWidth(.9f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    "Nome",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Pedro Henricky",
                    modifier = Modifier.weight(4f)
                )
            }
            Row(
                modifier = Modifier
                    .weight(.6f)
                    .fillMaxWidth(.9f),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                LabelText(
                    "Curso",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Técnico Desenvolvedor de Sistemas",
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(4f)
                )
            }
            QrCode(
                conteudo = "seunumerodematriculaaqui",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
            )
        }
    }
}
