package com.ordoterick28.test.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ordoterick28.test.presentation.screens.SharedViewModel
import com.ordoterick28.test.presentation.screens.details.DetailsScreen
import com.ordoterick28.test.presentation.screens.products.ProductsScreen


@Composable
fun ProductsNavigation(
    navController: NavHostController,
) {
    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Products.route
    ) {
        composable(
            route = Screen.Products.route,
        ){
            ProductsScreen(navController, sharedViewModel = sharedViewModel)
        }
        composable(
            route = Screen.Details.route
        ) {
            DetailsScreen(navController, sharedViewModel = sharedViewModel)
        }
    }
}