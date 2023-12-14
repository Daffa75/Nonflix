package com.D121211067.nonflix.movieList.presentation

sealed interface MovieListUiEvent{
    data class Paginate(val category: String) : MovieListUiEvent
    object Navigate: MovieListUiEvent
}