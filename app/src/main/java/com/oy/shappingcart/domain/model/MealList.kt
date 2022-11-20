package com.oy.shappingcart.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MealList(

    var id:String,
    var name:String,
    var thumb:String

): Parcelable
