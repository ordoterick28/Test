package com.ordoterick28.test.domain.model

import android.os.Parcelable
import kotlinx.serialization.Serializable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Product (
    val id: Int?,
    val title: String?,
    val description: String?,
    val price: Int?,
    val thumbnail:String?
): Parcelable