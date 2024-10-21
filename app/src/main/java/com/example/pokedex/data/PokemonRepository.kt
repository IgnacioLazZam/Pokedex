package com.example.pokedex.data

interface PokemonRepository {
    fun read():List<Pokemon>
    fun readOne(id:String):Pokemon
}