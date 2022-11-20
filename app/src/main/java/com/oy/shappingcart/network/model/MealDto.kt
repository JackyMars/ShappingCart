package com.oy.shappingcart.network.model

import com.google.gson.annotations.SerializedName

data class MealDto(

    @SerializedName("idMeal")
    var idMeal:String,

    @SerializedName("strMeal")
    var strMeal:String,

    @SerializedName("strCategory")
    var strCategory:String,

    @SerializedName("strArea")
    var strArea:String,

    @SerializedName("strInstructions")
    var strInstructions:String,

    @SerializedName("strMealThumb")
    var strMealThumb:String,

    @SerializedName("strIngredient1")
    var strIngredient1:String,

    @SerializedName("strIngredient2")
    var strIngredient2:String,

    @SerializedName("strIngredient3")
    var strIngredient3:String,

    @SerializedName("strIngredient4")
    var strIngredient4:String,

    @SerializedName("strIngredient5")
    var strIngredient5:String,

    @SerializedName("strIngredient6")
    var strIngredient6:String,

    @SerializedName("strIngredient7")
    var strIngredient7:String
)
