package com.example.pokedex.data.remote

interface PokemonRemoteDataSource {
    suspend fun readAll():List<RemotePokemon>
    suspend fun readOne(id:String): RemotePokemon
}