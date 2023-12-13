package com.D121211067.nonflix.movieList.data.repository

import com.D121211067.nonflix.movieList.data.local.movie.MovieDatabase
import com.D121211067.nonflix.movieList.data.remote.MovieApi
import com.D121211067.nonflix.movieList.domain.model.Movie
import com.D121211067.nonflix.movieList.domain.repository.MovieListRepository
import com.D121211067.nonflix.movieList.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieListRepositoryImpl @Inject constructor(
    private val movieApi: MovieApi,
    private val movieDatabase: MovieDatabase
) : MovieListRepository {

    override suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getMovie(id: Int): Flow<Resource<Movie>> {
        TODO("Not yet implemented")
    }
}