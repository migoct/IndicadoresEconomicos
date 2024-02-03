package com.dissolucion.indicadoreseconomicos.data.dto.todos

import com.google.gson.annotations.SerializedName

data class IndicadoresDto(
    val version: String,
    val autor: String,
    val fecha: String,
    val uf: UfDto,
    val ivp: IvpDto,
    val dolar: DolarDto,
    @SerializedName("dolar_intercambio")
    val dolarIntercambio: DolarIntercambioDto,
    val euro: EuroDto,
    val ipc: IpcDto,
    val utm: UtmDto,
    val imacec: ImacecDto,
    val tpm: TpmDto,
    @SerializedName("libra_cobre")
    val libraCobre: LibraCobreDto,
    @SerializedName("tasa_desempleo")
    val tasaDesempleo: TasaDesempleoDto,
    val bitcoin: BitcoinDto
)