package com.oy.shappingcart.network.response

import com.google.gson.annotations.SerializedName
import com.oy.shappingcart.network.model.MealDto

data class MealResponse(

    @SerializedName("meals")
    var meals:List<MealDto>
)
