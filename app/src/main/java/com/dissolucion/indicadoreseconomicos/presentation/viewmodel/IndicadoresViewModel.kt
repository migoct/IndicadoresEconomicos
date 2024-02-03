package com.dissolucion.indicadoreseconomicos.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dissolucion.indicadoreseconomicos.core.common.Resource
import com.dissolucion.indicadoreseconomicos.doamin.usecase.GetIndicadoresUseCase
import com.dissolucion.indicadoreseconomicos.presentation.state.IndicadoresState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class IndicadoresViewModel @Inject constructor(
    private val useCase: GetIndicadoresUseCase
): ViewModel() {
    private val _indicadoresState = MutableStateFlow(IndicadoresState())
    val indicadoresState: StateFlow<IndicadoresState> = _indicadoresState

    init {
        getIndicadores()
    }

    private fun getIndicadores() {
        useCase().onEach {
            when (it) {
                is Resource.Error -> {
                    _indicadoresState.value = IndicadoresState().copy(error = it.message)
                }
                is Resource.Loading -> {
                    _indicadoresState.value = IndicadoresState().copy(isLoading = true)
                }
                is Resource.Success -> {
                    _indicadoresState.value = IndicadoresState().copy(indicadores = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}
