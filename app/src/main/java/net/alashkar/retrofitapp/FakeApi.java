package net.alashkar.retrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeApi {

    @GET("posts")
    Call<List<Post>> getPosts();
}
