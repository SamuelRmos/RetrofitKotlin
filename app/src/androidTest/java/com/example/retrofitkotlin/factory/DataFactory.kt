package com.example.retrofitkotlin.factory

import com.example.retrofitkotlin.model.Movie

class DataFactory {

    companion object {
        fun randomList(): MutableList<Movie> {
            val movie = Movie(
                id = 419704,
                title = "Ad Astra",
                overview = "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. While a mysterious phenomenon menaces to destroy life on planet Earth, astronaut Roy McBride undertakes a mission across the immensity of space and its many perils to uncover the truth about a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.",
                poster_path = "/xBHvZcjRiWyobQ9kxBhO6B2dtRI.jpg",
                backdrop_path = "/5BwqwxMEjeFtdknRV792Svo0K1v.jpg"
            )
            val list = mutableListOf<Movie>()
            list.add(movie)
            return list
        }
    }
}