package com.moringaschool.kolum.moviefinder.network;

import com.moringaschool.kolum.moviefinder.models.movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {
    @GET("trending")
    Call<List<movie>> getMovies();
}
