package com.distructs.astrolab.core

interface NavigationEvent {
    val navTarget: com.distructs.astrolab.core.NavTarget
    val navOptions: com.distructs.astrolab.core.NavigationOptions

    fun onNavigateTo()
}