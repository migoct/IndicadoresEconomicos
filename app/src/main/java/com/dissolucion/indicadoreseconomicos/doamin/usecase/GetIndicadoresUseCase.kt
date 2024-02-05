package com.dissolucion.indicadoreseconomicos.doamin.usecase

import com.dissolucion.indicadoreseconomicos.doamin.repository.IndicadoresRepository
import javax.inject.Inject

class GetIndicadoresUseCase @Inject constructor(
    private val repository: IndicadoresRepository
) {
    suspend operator fun invoke() = repository.getIndicadores()
}
