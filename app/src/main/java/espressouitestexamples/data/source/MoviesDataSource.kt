package espressouitestexamples.data.source

import espressouitestexamples.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?

    fun getMovies(): List<Movie>
}