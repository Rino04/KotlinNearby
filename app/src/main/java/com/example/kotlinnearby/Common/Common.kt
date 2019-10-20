package com.example.kotlinnearby.Common

import com.example.kotlinnearby.Remote.IGoogleAPIService
import com.example.kotlinnearby.Remote.RetrofitClient

object Common {
    private val GOOGLE_API_URL="https://maps.googleapis.com/"

    val googleAPIService:IGoogleAPIService
    get ()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}