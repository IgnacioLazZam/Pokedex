package com.example.pokedex.data.remote

import com.example.pokedex.data.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {

    @GET("/api/v2/pokemon")
    suspend fun getAll():List<Pokemon>

    @GET("/api/v2/pokemon/{id}/")
    suspend fun getOne(@Path("id") id :String):Pokemon
}