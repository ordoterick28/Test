package com.ordoterick28.test.presentation.screens

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ordoterick28.test.data.repo.Repository
import com.ordoterick28.test.domain.model.Product
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {

    val TAGS = "SharedViewModel"

    var products = repository.getProducts()

    var product by mutableStateOf<Product?>(null)
        private set

    fun addProduct(newProduct: Product) {
        Log.d(TAGS, "addProduct()")
        product = newProduct
        Log.d(TAGS, "${product?.title}.")
    }
}