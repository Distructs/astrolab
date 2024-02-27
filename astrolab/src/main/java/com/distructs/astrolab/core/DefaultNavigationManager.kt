package com.distructs.astrolab.core

import androidx.navigation.NavController

class DefaultNavigationManager(private val navController: NavController) :
    com.distructs.astrolab.core.NavigationManager {
    override fun navigateTo(route: String) {
        navigateTo(com.distructs.astrolab.core.NavTarget(route))
    }

    override fun navigateTo(navTarget: com.distructs.astrolab.core.NavTarget) {
        navigateTo(navTarget, null)
    }

    override fun navigateTo(navTarget: com.distructs.astrolab.core.NavTarget, navigationOptions: com.distructs.astrolab.core.NavigationOptions?) {
        navController.navigate(route = navTarget.route, navOptions = navigationOptions?.toNavOptions())
    }
}