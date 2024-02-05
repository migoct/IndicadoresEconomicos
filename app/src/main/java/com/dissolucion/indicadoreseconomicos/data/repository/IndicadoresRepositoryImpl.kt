package com.dissolucion.indicadoreseconomicos.data.repository

import android.util.Log
import com.dissolucion.indicadoreseconomicos.core.common.Resource
import com.dissolucion.indicadoreseconomicos.data.api.IndicadoresApi
import com.dissolucion.indicadoreseconomicos.data.mapper.toDomainIndicadores
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Indicadores
import com.dissolucion.indicadoreseconomicos.doamin.repository.IndicadoresRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

@ViewModelScoped
class IndicadoresRepositoryImpl @Inject constructor(
    private val apiService: IndicadoresApi
) : IndicadoresRepository {

    override suspend fun getIndicadores(): Resource<Indicadores> {
        return try {
            Log.e("Repository", "getIndicadores")
            coroutineScope {
                val api = apiService.getIndicadores()
                Log.e("Repository", "getIndicadores api: $api")
                val result = api.toDomainIndicadores()
                Log.e("Repository", "getIndicadores result: $result")
                Resource.Success(result)
            }
        } catch (e: Exception) {
            Resource.Error(message = e.message.toString())
        }
    }
}
