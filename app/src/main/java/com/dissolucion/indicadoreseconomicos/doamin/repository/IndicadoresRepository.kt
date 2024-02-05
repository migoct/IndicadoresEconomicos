package com.dissolucion.indicadoreseconomicos.doamin.repository

import com.dissolucion.indicadoreseconomicos.core.common.Resource
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Indicadores

interface IndicadoresRepository {
  suspend fun getIndicadores(): Resource<Indicadores>
}

//suspend fun getIndicadores(): Resource<Indicadores> {
//    return try {
//        Log.e("Repository", "getIndicadores")
//        val api = apiService.getIndicadores()
//        Log.e("Repository", "getIndicadores api: $api")
//        val result = api.toDomainIndicadores()
//        Log.e("Repository", "getIndicadores result: $result")
//        Resource.Success(result)
//    } catch (e: Exception) {
//        Resource.Error(message = e.message.toString())
//    }
//}
