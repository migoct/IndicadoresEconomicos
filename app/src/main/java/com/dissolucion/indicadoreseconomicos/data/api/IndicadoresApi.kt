package com.dissolucion.indicadoreseconomicos.data.api

import com.dissolucion.indicadoreseconomicos.data.dto.todos.IndicadoresDto
import retrofit2.http.GET
import retrofit2.http.Headers

interface IndicadoresApi {

    @Headers("Content-Type: application/json")
    @GET("/")
    suspend fun getIndicadores(): IndicadoresDto
}
