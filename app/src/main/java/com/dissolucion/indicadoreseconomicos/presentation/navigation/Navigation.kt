package com.dissolucion.indicadoreseconomicos.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dissolucion.indicadoreseconomicos.presentation.indicadores_screen.IndicadoresScreen
import com.dissolucion.indicadoreseconomicos.presentation.viewmodel.IndicadoresViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.IndicadoresScreen.route) {
        composable(Screen.IndicadoresScreen.route) {
            val indicadoresViewModel = hiltViewModel<IndicadoresViewModel>()
            val indicadoresState = indicadoresViewModel.indicadoresState.collectAsStateWithLifecycle().value

            IndicadoresScreen(
                indicadoresState = indicadoresState,
                modifier = Modifier,
                onIndicadorClick = { }
            )
        }
    }
}