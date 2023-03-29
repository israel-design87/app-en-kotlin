package com.example.androidisrael.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/10228862630645759/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/10228862630645759/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String): Response<SuperHeroDetailResponse>
}