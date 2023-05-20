package com.ordoterick28.test.presentation.screens.products

import android.annotation.SuppressLint
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.collectAsState
import com.ordoterick28.test.presentation.screens.SharedViewModel



@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProductsScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {

    val TAGS = "ProductsScreen"
    val products by sharedViewModel.products.collectAsState(initial = emptyList())

    Scaffold(
        content = {
            ProductsContent(
                navController = navController,
                products = products,
                sharedViewModel = sharedViewModel
            )
        }
    )
}