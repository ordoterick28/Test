package com.ordoterick28.test.data.repo


import com.ordoterick28.test.data.remote.api.ProductsApi
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: ProductsApi,
) {

    fun getProducts() = flow {
        val products = api.getProducts().products
        emit(products)
    }
}