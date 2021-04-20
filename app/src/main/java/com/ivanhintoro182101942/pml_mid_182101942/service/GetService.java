package com.ivanhintoro182101942.pml_mid_182101942.service;

import com.ivanhintoro182101942.pml_mid_182101942.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
