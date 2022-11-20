package com.oy.shappingcart.network.model

import com.google.gson.annotations.SerializedName

data class CategoriesDto(

    @SerializedName("idCategory")
    var idCategory:String,

    @SerializedName("strCategory")
    var strCategory:String,

    @SerializedName("strCategoryThumb")
    var strCategoryThumb:String
)
