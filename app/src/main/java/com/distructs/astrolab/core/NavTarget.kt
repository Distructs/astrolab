package com.distructs.astrolab.core

data class NavTarget(
    val route: String,
    val arguments: Map<String, Any>? = null
)
