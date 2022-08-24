package com.example.movie;

import com.example.movie.model.Api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String SERVER = "https://springfilm.herokuapp.com";

    @GET("/apifree/home")
    Call<Api> apiGetData();
}
