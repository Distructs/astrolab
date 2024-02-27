package com.distructs.astrolab.core

interface NavigationEvent {
    val navTarget: NavTarget
    val navOptions: NavigationOptions

    fun onNavigateTo()
}