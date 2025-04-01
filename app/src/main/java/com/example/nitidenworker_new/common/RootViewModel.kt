package com.example.nitidenworker_new.common

import com.example.nitidenworker_new.core.base.BaseViewModel

class RootViewModel: BaseViewModel<RootViewState, RootEvent>(RootViewState.initial()) {
    override fun onTriggerEvent(event: RootEvent) {
        when (event) {
            is RootEvent.OnBottomBarDestinationClick -> {
                updateState(
                    viewState.value.copy(
                        bottomBarIndex = event.destination
                    )
                )
            }
        }
    }
}