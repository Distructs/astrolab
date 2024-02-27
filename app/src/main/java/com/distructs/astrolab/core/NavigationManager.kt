package com.distructs.astrolab.core

interface NavigationManager {
    fun navigateTo(route: String)
    fun navigateTo(navTarget: NavTarget)
    fun navigateTo(navTarget: NavTarget, navigationOptions: NavigationOptions? = null)
}