package com.dissolucion.indicadoreseconomicos.presentation.indicadores_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dissolucion.indicadoreseconomicos.presentation.indicadores_screen.components.IndicadoresList
import com.dissolucion.indicadoreseconomicos.presentation.state.IndicadoresState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IndicadoresScreen(
    indicadoresState: IndicadoresState,
    modifier: Modifier = Modifier,
    onIndicadorClick: (String) -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text(text = "Indicadores Económicos") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            if (indicadoresState.isLoading) {
                Box(
                    modifier = modifier.fillMaxSize()
                ) {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }
            } else if (indicadoresState.error?.isNotEmpty() == true) {
                Box(
                    modifier = modifier.fillMaxSize()
                ) {
                    Text(
                        text = indicadoresState.error.toString(),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

            }
            if (indicadoresState.indicadores != null) {
                IndicadoresList(
                    indicadores = indicadoresState.indicadores,
                    onItemClick = onIndicadorClick
                )
            }
        }
    }
}