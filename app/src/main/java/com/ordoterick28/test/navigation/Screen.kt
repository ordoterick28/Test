package com.ordoterick28.test.navigation

sealed class Screen(val route: String) {

    object Products: Screen("products_screen")
    object Details : Screen("details_screen")
}