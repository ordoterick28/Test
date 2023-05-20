package com.ordoterick28.test.data.repo

import com.ordoterick28.test.domain.model.Product
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource
) {
    fun getProducts(): Flow<List<Product>> = remote.getProducts()
}