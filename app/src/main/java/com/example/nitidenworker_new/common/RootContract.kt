package com.example.nitidenworker_new.common

data class RootViewState(
    val bottomBarIndex: Int = 0,
) {
    companion object {
        fun initial() = RootViewState()
    }
}

sealed class RootEvent {
    data class OnBottomBarDestinationClick(val destination: Int) : RootEvent()
}
