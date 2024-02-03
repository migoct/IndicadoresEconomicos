package com.dissolucion.indicadoreseconomicos.doamin.model.todos

import com.google.gson.annotations.SerializedName

data class Indicadores(
    val fecha: String,
    val uf: Uf,
    val ivp: Ivp,
    val dolar: Dolar,
    @SerializedName("dolar_intercambio")
    val dolarIntercambio: DolarIntercambio,
    val euro: Euro,
    val ipc: Ipc,
    val utm: Utm,
    val imacec: Imacec,
    val tpm: Tpm,
    @SerializedName("libra_cobre")
    val libraCobre: LibraCobre,
    @SerializedName("tasa_desempleo")
    val tasaDesempleo: TasaDesempleo,
    val bitcoin: Bitcoin,
)
