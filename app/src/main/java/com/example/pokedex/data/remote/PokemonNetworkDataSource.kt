package com.example.pokedex.data.remote

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonNetworkDataSource @Inject constructor():PokemonRemoteDataSource {
    override suspend fun readAll(): List<RemotePokemon> {
        TODO("Not yet implemented")
    }

    override suspend fun readOne(id: String): RemotePokemon {
        TODO("Not yet implemented")
    }
}