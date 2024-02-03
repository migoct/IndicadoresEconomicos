package com.dissolucion.indicadoreseconomicos.data.dto.todos

import com.google.gson.annotations.SerializedName

data class EuroDto(
    val codigo: String,
    val nombre: String,
    @SerializedName("unidad_medida")
    val unidadMedida: String,
    val fecha: String,
    val valor: Double
)