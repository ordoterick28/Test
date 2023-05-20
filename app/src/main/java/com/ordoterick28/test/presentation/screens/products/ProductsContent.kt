package com.ordoterick28.test.presentation.screens.products

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ordoterick28.test.domain.model.Product


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.RectangleShape

import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ordoterick28.test.navigation.Screen
import com.ordoterick28.test.presentation.screens.SharedViewModel


@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun  ProductsContent(
    products: List<Product>,
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    DisplayProducts(
        products = products,
        navController = navController,
        sharedViewModel = sharedViewModel
    )

}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DisplayProducts(
    products: List<Product>,
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    Column(modifier = Modifier
        .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 24.dp),
            text = "Productos",
            color = Color(0xFF0A4AA3),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
        )
        LazyColumn(
        ) {
            items(
                items = products
            ) {
                ProductItem(
                    product = it,
                    navController = navController,
                    sharedViewModel = sharedViewModel
                )
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun ProductItem(
    product: Product,
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val TAGS = "ProductItem"
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RectangleShape,
        elevation = 1.dp,
        onClick = {
            product.id?.let {
                sharedViewModel.addProduct(product)
                navController.navigate(Screen.Details.route)
            }
        }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
            ,
            border = BorderStroke(1.dp, Color(0xFF0A4AA3)),
        ) {
            Column {
                Text(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 8.dp, start = 16.dp, end = 16.dp),
                    text = "Nombre: " + product.title ,
                )
                Text(
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 8.dp, start = 16.dp, end = 16.dp),
                    text = product.description ?: "Unknown",
                )
                Text(
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
                    text = "Precio: " + product.price,
                )
            }

        }
    }
}