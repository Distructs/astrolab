package com.distructs.astrolab.core

import androidx.navigation.NavOptions

class NavigationOptions internal constructor(
    val singleTop: Boolean,
    val restoreState: Boolean,
    val popUpToRoute: String?,
    val popUpToInclusive: Boolean,
    val popUpToSaveState: Boolean,
    val enterAnim: Int,
    val exitAnim: Int,
    val popEnterAnim: Int,
    val popExitAnim: Int,
) {
    class Builder {
        var singleTop: Boolean = false
        var restoreState: Boolean = false
        var popUpToRoute: String? = null
        var popUpToInclusive: Boolean = false
        var popUpToSaveState: Boolean = false
        var enterAnim: Int = -1
        var exitAnim: Int = -1
        var popEnterAnim: Int = -1
        var popExitAnim: Int = -1

        fun setLaunchSingleTop(singleTop: Boolean) = apply { this.singleTop = singleTop }
        fun setRestoreState(restoreState: Boolean) = apply { this.restoreState = restoreState }
        fun setPopUpTo(
            route: String?,
            inclusive: Boolean,
            saveState: Boolean = false
        ) = apply {
            this.popUpToRoute = route
            this.popUpToInclusive = inclusive
            this.popUpToSaveState = saveState
        }
        fun setEnterAnim(enterAnim: Int) = apply { this.enterAnim = enterAnim }
        fun setExitAnim(exitAnim: Int) = apply { this.exitAnim = exitAnim }
        fun setPopEnterAnim(popEnterAnim: Int) = apply { this.popEnterAnim = popEnterAnim }
        fun setPopExitAnim(popExitAnim: Int) = apply { this.popExitAnim = popExitAnim }

        fun build(): NavigationOptions {
            return NavigationOptions(
                singleTop,
                restoreState,
                popUpToRoute,
                popUpToInclusive,
                popUpToSaveState,
                enterAnim,
                exitAnim,
                popEnterAnim,
                popExitAnim
            )
        }
    }

    fun toNavOptions(): NavOptions {
        return NavOptions.Builder()
            .apply {
                setLaunchSingleTop(this@NavigationOptions.singleTop)
                setRestoreState(this@NavigationOptions.restoreState)
                setPopUpTo(
                    this@NavigationOptions.popUpToRoute,
                    this@NavigationOptions.popUpToInclusive,
                    this@NavigationOptions.popUpToSaveState
                )
                setEnterAnim(this@NavigationOptions.enterAnim)
                setExitAnim(this@NavigationOptions.exitAnim)
                setPopEnterAnim(this@NavigationOptions.popEnterAnim)
                setPopExitAnim(this@NavigationOptions.popExitAnim)
            }.build()
    }
}
