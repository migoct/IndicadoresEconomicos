package com.dissolucion.indicadoreseconomicos.doamin.model.todos

import com.google.gson.annotations.SerializedName

data class Ipc(
    val codigo: String,
    val nombre: String,
    @SerializedName("unidad_medida")
    val unidadMedida: String,
    val fecha: String,
    val valor: Double
)