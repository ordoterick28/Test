package com.ordoterick28.test.data.remote.api




import com.ordoterick28.test.domain.model.ProductsResponse
import retrofit2.http.*

interface ProductsApi {

    @GET("/products")
    suspend fun getProducts(): ProductsResponse

}