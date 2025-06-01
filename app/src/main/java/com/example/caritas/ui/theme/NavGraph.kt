package com.example.caritas.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.caritas.Screens.HomeScreen

@Composable
fun Nav(){
    val NavController = rememberNavController()
    NavHost(navController = NavController, startDestination = "Home"){
        composable(route = "Home") {
            HomeScreen(navController = NavController)
        }
        composable(route = "Galery") {

        }
    }
}