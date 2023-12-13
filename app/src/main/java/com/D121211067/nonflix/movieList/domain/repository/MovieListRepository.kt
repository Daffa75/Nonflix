package com.D121211067.nonflix.movieList.domain.repository

import com.D121211067.nonflix.movieList.domain.model.Movie
import com.D121211067.nonflix.movieList.util.Resource
import kotlinx.coroutines.flow.Flow


interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}