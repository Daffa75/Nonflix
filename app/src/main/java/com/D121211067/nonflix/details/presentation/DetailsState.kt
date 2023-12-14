package com.D121211067.nonflix.details.presentation

import com.D121211067.nonflix.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
