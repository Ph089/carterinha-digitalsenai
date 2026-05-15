package com.example.carterinha_digital_senai.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carterinha_digital_senai.core.designsystem.theme.CarterinhadigitalsenaiTheme
import com.example.carterinha_digital_senai.feature.unidadecurricular.domain.model.UnidadeCurricular
import com.example.carterinha_digital_senai.feature.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
 fun UnidadeCurricularContent(
     modifier: Modifier = Modifier,
     unidadesCurriculares: List <UnidadeCurricular>
 ) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp),
    ) {
        items( unidadesCurriculares){ uc ->
            UnidadeCurricularCard(
                unidadeCurricular = uc)

        }

    }
}
@Preview(showBackground = true,
        showSystemUi = true
)
@Composable
fun UnidadeCurricularCardPreview() {
    CarterinhadigitalsenaiTheme() {
        UnidadeCurricularContent(
            unidadesCurriculares = listOf(
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
        )

    }
}
