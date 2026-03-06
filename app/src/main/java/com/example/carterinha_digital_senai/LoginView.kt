package com.example.carterinha_digital_senai

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.carterinha_digital_senai.ui.theme.CarterinhadigitalsenaiTheme
import java.lang.reflect.Modifier

@Composable
fun LoginView(modifier: Modifier = Modifier) {
    Column {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text( "Login")
            },

        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text( "Login")
            },
        )

        Button(
            onClick = {}
        ) {
            Text("Entrar")
        }
    }



}
    @Preview(
        showBackground = true,
        showSystemUi = true

)
    @Composable
    fun PreviewLoginClaro(){
        CarterinhadigitalsenaiTheme(darkTheme = false) {
            LoginView(
                modifier = Modifier

            )
    }
}
    @Preview(
        showBackground = true,
        showSystemUi = true
)
    @Composable
    fun PreviewLoginEscuro(){
        CarterinhadigitalsenaiTheme(darkTheme = true) {
         LoginView()
    }
}
