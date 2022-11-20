package com.oy.shappingcart.network.response

import com.google.gson.annotations.SerializedName
import com.oy.shappingcart.network.model.MealsSearchDto

data class MealsSearchResponse(

    @SerializedName("meals")
    var meals:List<MealsSearchDto>
)
