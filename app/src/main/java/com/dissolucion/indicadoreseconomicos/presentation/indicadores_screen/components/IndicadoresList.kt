package com.dissolucion.indicadoreseconomicos.presentation.indicadores_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dissolucion.indicadoreseconomicos.doamin.model.todos.*
import com.dissolucion.indicadoreseconomicos.presentation.ui.theme.IndicadoresEconomicosTheme

@Composable
fun IndicadoresList(
    indicadores: Indicadores,
    onItemClick: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            CardItem(
                codigo = indicadores.uf.codigo,
                nombre = indicadores.uf.nombre,
                valor = indicadores.uf.valor.toString(),
                unidadMedida = indicadores.uf.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.utm.codigo,
                nombre = indicadores.utm.nombre,
                valor = indicadores.utm.valor.toString(),
                unidadMedida = indicadores.utm.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.dolar.codigo,
                nombre = indicadores.dolar.nombre,
                valor = indicadores.dolar.valor.toString(),
                unidadMedida = indicadores.dolar.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.dolarIntercambio.codigo,
                nombre = indicadores.dolarIntercambio.nombre,
                valor = indicadores.dolarIntercambio.valor.toString(),
                unidadMedida = indicadores.dolarIntercambio.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.euro.codigo,
                nombre = indicadores.euro.nombre,
                valor = indicadores.euro.valor.toString(),
                unidadMedida = indicadores.euro.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.bitcoin.codigo,
                nombre = indicadores.bitcoin.nombre,
                valor = indicadores.bitcoin.valor.toString(),
                unidadMedida = indicadores.bitcoin.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.libraCobre.codigo,
                nombre = indicadores.libraCobre.nombre,
                valor = indicadores.libraCobre.valor.toString(),
                unidadMedida = indicadores.libraCobre.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.ipc.codigo,
                nombre = indicadores.ipc.nombre,
                valor = indicadores.ipc.valor.toString(),
                unidadMedida = indicadores.ipc.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.ivp.codigo,
                nombre = indicadores.ivp.nombre,
                valor = indicadores.ivp.valor.toString(),
                unidadMedida = indicadores.ivp.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.imacec.codigo,
                nombre = indicadores.imacec.nombre,
                valor = indicadores.imacec.valor.toString(),
                unidadMedida = indicadores.imacec.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.tpm.codigo,
                nombre = indicadores.tpm.nombre,
                valor = indicadores.tpm.valor.toString(),
                unidadMedida = indicadores.tpm.unidadMedida,
                onItemClick = onItemClick
            )
        }
        item {
            CardItem(
                codigo = indicadores.tasaDesempleo.codigo,
                nombre = indicadores.tasaDesempleo.nombre,
                valor = indicadores.tasaDesempleo.valor.toString(),
                unidadMedida = indicadores.tasaDesempleo.unidadMedida,
                onItemClick = onItemClick
            )
        }
    }
}

@Composable
fun CardItem(
    codigo: String,
    nombre: String,
    valor: String,
    unidadMedida: String,
    onItemClick: (String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(codigo) },
        elevation = CardDefaults.cardElevation(12.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = nombre,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = valor)
            Text(text = unidadMedida)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    IndicadoresEconomicosTheme {
        IndicadoresList(
            indicadores = Indicadores(
                fecha = "2024-02-02T15:00:00.000Z",
                uf = Uf(
                    codigo = "uf",
                    nombre = "Unidad de fomento (UF)",
                    unidadMedida = "Pesos",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 36721.16
                ),
                ivp = Ivp(
                    codigo = "ivp",
                    nombre = "Indice de valor promedio (IVP)",
                    unidadMedida = "Pesos",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 38180.46
                ),
                dolar = Dolar(
                    codigo = "dolar",
                    nombre = "Dólar observado",
                    unidadMedida = "Pesos",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 936.01
                ),
                dolarIntercambio = DolarIntercambio(
                    codigo = "dolar_intercambio",
                    nombre = "Dólar acuerdo",
                    unidadMedida = "Pesos",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 758.87
                ),
                euro = Euro(
                    codigo = "euro",
                    nombre = "Euro",
                    unidadMedida = "Pesos",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 1017.18
                ),
                ipc = Ipc(
                    codigo = "ipc",
                    nombre = "Indice de Precios al Consumidor (IPC)",
                    unidadMedida = "Porcentaje",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = -0.5
                ),
                utm = Utm(
                    codigo = "utm",
                    nombre = "Unidad Tributaria Mensual (UTM)",
                    unidadMedida = "Pesos",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 64343
                ),
                imacec = Imacec(
                    codigo = "imacec",
                    nombre = "Imacec",
                    unidadMedida = "Porcentaje",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = -1
                ),
                tpm = Tpm(
                    codigo = "tpm",
                    nombre = "Tasa Política Monetaria (TPM)",
                    unidadMedida = "Porcentaje",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 7.25
                ),
                libraCobre = LibraCobre(
                    codigo = "libra_cobre",
                    nombre = "Libra de Cobre",
                    unidadMedida = "Dólar",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 3.86
                ),
                tasaDesempleo = TasaDesempleo(
                    codigo = "tasa_desempleo",
                    nombre = "Tasa de desempleo",
                    unidadMedida = "Porcentaje",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 8.48
                ),
                bitcoin = Bitcoin(
                    codigo = "bitcoin",
                    nombre = "Bitcoin",
                    unidadMedida = "Dólar",
                    fecha = "2024-02-02T03:00:00.000Z",
                    valor = 42249.69
                )
            ),
            onItemClick = {}
        )
    }
}
