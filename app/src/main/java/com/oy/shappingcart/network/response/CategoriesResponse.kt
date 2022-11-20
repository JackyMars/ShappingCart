package com.oy.shappingcart.network.response

import com.google.gson.annotations.SerializedName
import com.oy.shappingcart.network.model.CategoriesDto

data class CategoriesResponse(
    @SerializedName("categories")
    var categories:List<CategoriesDto>
)
