package com.ordoterick28.test.domain.model


import kotlinx.serialization.Serializable
import com.google.gson.annotations.SerializedName
import com.ordoterick28.test.domain.model.Product

@Serializable
data class ProductsResponse (
    @SerializedName("products")
    val products: List<Product>
)