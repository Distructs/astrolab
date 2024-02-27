package com.distructs.astrolab.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationBus(navController: NavController = rememberNavController()) {

    LaunchedEffect(navController) {

    }
}