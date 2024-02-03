package com.dissolucion.indicadoreseconomicos.doamin.repository

import com.dissolucion.indicadoreseconomicos.core.common.Resource
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Indicadores
import kotlinx.coroutines.flow.Flow

interface IndicadoresRepository {
    fun getIndicadores(): Flow<Resource<Indicadores>>
}

