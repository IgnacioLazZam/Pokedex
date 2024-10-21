package com.example.pokedex.data

import javax.inject.Singleton

@Singleton
class DefaultPokemonRepository(

):PokemonRepository {
    override fun read(): List<Pokemon> {
        TODO("Not yet implemented")
    }

    override fun readOne(id: String): Pokemon {
        TODO("Not yet implemented")
    }
}