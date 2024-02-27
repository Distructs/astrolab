package com.distructs.astrolab.core

import androidx.navigation.NavController

class DefaultNavigationManager(private val navController: NavController) : NavigationManager {
    override fun navigateTo(route: String) {
        navigateTo(NavTarget(route))
    }

    override fun navigateTo(navTarget: NavTarget) {
        navigateTo(navTarget, null)
    }

    override fun navigateTo(navTarget: NavTarget, navigationOptions: NavigationOptions?) {
        navController.navigate(route = navTarget.route, navOptions = navigationOptions?.toNavOptions())
    }
}