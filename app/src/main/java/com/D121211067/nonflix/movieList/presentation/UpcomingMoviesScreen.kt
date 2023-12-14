package com.D121211067.nonflix.movieList.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.D121211067.nonflix.R
import com.D121211067.nonflix.movieList.presentation.components.MovieItem
import com.D121211067.nonflix.movieList.util.Category

@Composable
fun UpcomingMoviesScreen(
    movieListState: MovieListState,
    navController: NavHostController,
    onEvent: (MovieListUiEvent) -> Unit
) {

    if (movieListState.upcomingMovieList.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else {
        Column {
            Text(
                text = stringResource(R.string.upcoming_movies),
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 16.dp, start = 14.dp, bottom = 8.dp)
            )

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 4.dp)
            ) {
                items(movieListState.upcomingMovieList.size) {index ->
                    MovieItem(
                        movie = movieListState.upcomingMovieList[index],
                        navHostController = navController
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    if (index >= movieListState.popularMovieList.size - 1 && !movieListState.isLoading) {
                        onEvent(MovieListUiEvent.Paginate(Category.UPCOMING))
                    }
                }
            }
        }
    }

}