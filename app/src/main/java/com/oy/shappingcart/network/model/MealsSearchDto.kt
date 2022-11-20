package com.oy.shappingcart.network.model

import com.google.gson.annotations.SerializedName


data class MealsSearchDto(

    @SerializedName("strMeal")
    var strMeal:String,

    @SerializedName("strMealThumb")
    var strMealThumb:String,

    @SerializedName("idMeal")
    var idMeal:String

)
