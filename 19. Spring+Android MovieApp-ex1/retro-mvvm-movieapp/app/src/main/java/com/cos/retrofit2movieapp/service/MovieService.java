package com.cos.retrofit2movieapp.service;

import com.cos.retrofit2movieapp.model.Movie;
import com.cos.retrofit2movieapp.model.ResponseDto;
import com.google.gson.Gson;

import java.util.List;

import lombok.NoArgsConstructor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovieService {

    @GET("api/movie")
    Call<ResponseDto<List<Movie>>> findAll();

    @DELETE("api/movie/{id}")
    Call<ResponseDto> deleteById(@Path("id") long id);


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://172.30.1.22:8000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}

