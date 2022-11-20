package com.oy.shappingcart.network

import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("filter.php")
    suspend fun search(
        @Query("c") category:String
    )
    @GET("lookup.php")
    suspend fun get(
        @Query("i") id:String
    )
    @GET("categories.php")
    suspend fun categories()


}