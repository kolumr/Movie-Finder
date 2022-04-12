package com.moringaschool.kolum.moviefinder.network;

import com.moringaschool.kolum.moviefinder.models.apiResponse;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {
    @GET("trending/movie/day?api_key=6a3d6c93e17763b6a2e036f59c735020")
    Call<apiResponse> getResponse();
}
