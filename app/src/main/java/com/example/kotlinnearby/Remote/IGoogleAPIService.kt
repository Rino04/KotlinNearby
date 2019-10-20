package com.example.kotlinnearby.Remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url
import com.example.kotlinnearby.Model.MyPlaces

interface IGoogleAPIService {
    @GET
    fun getNearbyPlaces(@Url url: String): Call<MyPlaces>
}