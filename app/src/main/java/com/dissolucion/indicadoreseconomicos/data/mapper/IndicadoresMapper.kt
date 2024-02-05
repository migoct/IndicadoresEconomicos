package com.dissolucion.indicadoreseconomicos.data.mapper

import com.dissolucion.indicadoreseconomicos.data.dto.todos.BitcoinDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.DolarDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.DolarIntercambioDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.EuroDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.ImacecDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.IndicadoresDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.IpcDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.IvpDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.LibraCobreDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.TasaDesempleoDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.TpmDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.UfDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos.UtmDto
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.BitcoinMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.DolarIntercambioMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.DolarMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.EuroMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.ImacecMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.IndicadoresMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.IpcMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.IvpMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.LibraCobreMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.TasaDesempleoMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.TpmMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.UfMoshi
import com.dissolucion.indicadoreseconomicos.data.dto.todos_moshi.UtmMoshi
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Bitcoin
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Dolar
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.DolarIntercambio
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Euro
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Imacec
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Indicadores
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Ipc
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Ivp
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.LibraCobre
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.TasaDesempleo
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Tpm
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Uf
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.Utm

fun IndicadoresDto.toDomainIndicadores(): Indicadores {
    return Indicadores(
        fecha = fecha,
        uf = uf.toDomainUf(),
        ivp = ivp.toDomainIvp(),
        dolar = dolar.toDomainDolar(),
        dolarIntercambio = dolarIntercambio.toDomainDolarIntercambio(),
        euro = euro.toDomainEuro(),
        ipc = ipc.toDomainIpc(),
        utm = utm.toDomainUtm(),
        imacec = imacec.toDomainImacec(),
        tpm = tpm.toDomainTpm(),
        libraCobre = libraCobre.toDomainLibraCobre(),
        tasaDesempleo = tasaDesempleo.toDomainTasaDesempleo(),
        bitcoin = bitcoin.toDomainBitcoin(),
    )
}

fun UfDto.toDomainUf(): Uf {
    return Uf(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun IpcDto.toDomainIpc(): Ipc {
    return Ipc(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun IvpDto.toDomainIvp(): Ivp {
    return Ivp(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun DolarDto.toDomainDolar(): Dolar {
    return Dolar(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun DolarIntercambioDto.toDomainDolarIntercambio(): DolarIntercambio {
    return DolarIntercambio(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun EuroDto.toDomainEuro(): Euro {
    return Euro(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun UtmDto.toDomainUtm(): Utm {
    return Utm(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun ImacecDto.toDomainImacec(): Imacec {
    return Imacec(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun TpmDto.toDomainTpm(): Tpm {
    return Tpm(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun LibraCobreDto.toDomainLibraCobre(): LibraCobre {
    return LibraCobre(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun TasaDesempleoDto.toDomainTasaDesempleo(): TasaDesempleo {
    return TasaDesempleo(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun BitcoinDto.toDomainBitcoin(): Bitcoin {
    return Bitcoin(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun IndicadoresMoshi.toDomainIndicadores(): Indicadores {
    return Indicadores(
        fecha = fecha,
        uf = uf.toDomainUf(),
        ivp = ivp.toDomainIvp(),
        dolar = dolar.toDomainDolar(),
        dolarIntercambio = dolarIntercambio.toDomainDolarIntercambio(),
        euro = euro.toDomainEuro(),
        ipc = ipc.toDomainIpc(),
        utm = utm.toDomainUtm(),
        imacec = imacec.toDomainImacec(),
        tpm = tpm.toDomainTpm(),
        libraCobre = libraCobre.toDomainLibraCobre(),
        tasaDesempleo = tasaDesempleo.toDomainTasaDesempleo(),
        bitcoin = bitcoin.toDomainBitcoin(),
    )
}

fun UfMoshi.toDomainUf(): Uf {
    return Uf(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun IvpMoshi.toDomainIvp(): Ivp {
    return Ivp(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun DolarMoshi.toDomainDolar(): Dolar {
    return Dolar(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun DolarIntercambioMoshi.toDomainDolarIntercambio(): DolarIntercambio {
    return DolarIntercambio(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun EuroMoshi.toDomainEuro(): Euro {
    return Euro(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun IpcMoshi.toDomainIpc(): Ipc {
    return Ipc(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun UtmMoshi.toDomainUtm(): Utm {
    return Utm(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun ImacecMoshi.toDomainImacec(): Imacec {
    return Imacec(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun TpmMoshi.toDomainTpm(): Tpm {
    return Tpm(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun LibraCobreMoshi.toDomainLibraCobre(): LibraCobre {
    return LibraCobre(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun TasaDesempleoMoshi.toDomainTasaDesempleo(): TasaDesempleo {
    return TasaDesempleo(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

fun BitcoinMoshi.toDomainBitcoin(): Bitcoin {
    return Bitcoin(
        codigo = codigo,
        nombre = nombre,
        unidadMedida = unidadMedida,
        fecha = fecha,
        valor = valor,
    )
}

