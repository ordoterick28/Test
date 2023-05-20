package com.ordoterick28.test.presentation.screens.details

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
import com.ordoterick28.test.domain.model.Product
import com.ordoterick28.test.presentation.screens.SharedViewModel

@Composable
fun DetailsContent(
    navController: NavHostController,
    product: Product?
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 24.dp),
            text = "${product?.title}",
            color = Color(0xFF000000),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
        )
        Spacer(modifier = Modifier
            .height(24.dp)
            .fillMaxWidth()
        )
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)             ,
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = "${product?.thumbnail}")
                .placeholder(drawableResId = R.drawable.ic_image_placeholder)
                .error(drawableResId = R.drawable.ic_launcher_foreground)
                .build(),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier
            .height(24.dp)
            .fillMaxWidth()
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 24.dp),
            text = "${product?.description}",
            color = Color(0xFF000000),
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 32.dp),
            text = "Precio: ${product?.price}",
            color = Color(0xFF000000),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier
            .height(32.dp)
            .fillMaxWidth()
        )
        TextButton(
            onClick = {
                navController.navigateUp()
            },
            modifier = Modifier
                .padding(start = 35.dp, end = 35.dp)
                .height(50.dp)
                .fillMaxWidth()
                .border(width = 1.dp, Color(0xFF0A4AA3))

        ) {
            Text("Cerrar",
                color = Color(0xFF0A4AA3)
            )
        }
        Spacer(modifier = Modifier
            .height(24.dp)
            .fillMaxWidth()
        )
}
}