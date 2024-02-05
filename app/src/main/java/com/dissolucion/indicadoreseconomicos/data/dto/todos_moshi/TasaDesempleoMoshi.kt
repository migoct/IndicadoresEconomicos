package com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TasaDesempleoMoshi(
    @Json(name = "codigo")
    val codigo: String,
    @Json(name = "nombre")
    val nombre: String,
    @Json(name = "unidad_medida")
    val unidadMedida: String,
    @Json(name = "fecha")
    val fecha: String,
    @Json(name = "valor")
    val valor: Double
)