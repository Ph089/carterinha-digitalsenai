package com.example.carterinha_digital_senai.feature.unidadecurricular.data.repository

import com.example.carterinha_digital_senai.feature.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun  buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}