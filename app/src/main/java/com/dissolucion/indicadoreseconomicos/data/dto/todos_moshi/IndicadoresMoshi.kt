package com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IndicadoresMoshi(
    @Json(name = "version")
    val version: String,
    @Json(name = "autor")
    val autor: String,
    @Json(name = "fecha")
    val fecha: String,
    @Json(name = "uf")
    val uf: UfMoshi,
    @Json(name = "ivp")
    val ivp: IvpMoshi,
    @Json(name = "dolar")
    val dolar: DolarMoshi,
    @Json(name = "dolar_intercambio")
    val dolarIntercambio: DolarIntercambioMoshi,
    @Json(name = "euro")
    val euro: EuroMoshi,
    @Json(name = "ipc")
    val ipc: IpcMoshi,
    @Json(name = "utm")
    val utm: UtmMoshi,
    @Json(name = "imacec")
    val imacec: ImacecMoshi,
    @Json(name = "tpm")
    val tpm: TpmMoshi,
    @Json(name = "libra_cobre")
    val libraCobre: LibraCobreMoshi,
    @Json(name = "tasa_desempleo")
    val tasaDesempleo: TasaDesempleoMoshi,
    @Json(name = "bitcoin")
    val bitcoin: BitcoinMoshi
)