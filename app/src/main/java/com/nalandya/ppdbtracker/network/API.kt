package com.nalandya.ppdbtracker.network

import com.nalandya.ppdbtracker.model.ResponseSchool
import retrofit2.Response
import retrofit2.http.GET

interface API {

    @GET("seleksi/reguler/sma/1-32030333-0.json")
    suspend fun getDataSchoolOne(): Response<ResponseSchool>

    @GET("seleksi/reguler/sma/1-32030332-0.json")
    suspend fun getDataSchoolTwo(): Response<ResponseSchool>

    @GET("seleksi/reguler/sma/1-32030331-0.json")
    suspend fun getDataSchoolThree(): Response<ResponseSchool>

}