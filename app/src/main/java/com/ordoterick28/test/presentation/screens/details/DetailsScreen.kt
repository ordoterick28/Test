package com.ordoterick28.test.presentation.screens.details

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.ordoterick28.test.R
import com.ordoterick28.test.presentation.screens.SharedViewModel
import com.ordoterick28.test.presentation.screens.products.ProductsContent

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailsScreen (
    navController: NavHostController,
    sharedViewModel: SharedViewModel

) {
    val TAGS = "DetailsScreen"
    var product = sharedViewModel.product

    Scaffold(
        content = {
            DetailsContent(
                navController = navController,
                product = product
            )
        }
    )
}
