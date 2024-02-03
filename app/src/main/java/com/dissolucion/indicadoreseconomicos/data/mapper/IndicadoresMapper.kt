package com.dissolucion.indicadoreseconomicos.data.mapper

import com.dissolucion.indicadoreseconomicos.data.dto.todos.*
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.*

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
