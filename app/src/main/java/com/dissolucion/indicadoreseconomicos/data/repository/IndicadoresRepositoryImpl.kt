package com.dissolucion.indicadoreseconomicos.data.repository

import com.dissolucion.indicadoreseconomicos.core.common.Resource
import com.dissolucion.indicadoreseconomicos.data.api.IndicadoresApi
import com.dissolucion.indicadoreseconomicos.data.mapper.toDomainIndicadores
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Indicadores
import com.dissolucion.indicadoreseconomicos.doamin.repository.IndicadoresRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@ViewModelScoped
class IndicadoresRepositoryImpl @Inject constructor(
    private val api: IndicadoresApi
) : IndicadoresRepository {
    override fun getIndicadores(): Flow<Resource<Indicadores>> {
        return flow {
            emit(Resource.Loading())
            val result = api.getIndicadores().toDomainIndicadores()
            emit(Resource.Success(result))
        }.flowOn(Dispatchers.IO)
            .catch {e ->
                emit(Resource.Error(e.message.toString()))
            }
    }
}
