package com.dhims.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dhimant on 23/6/18.
 */
interface UserService {

    @GET("/")
    Call<ResponseBody> callApi();
}
