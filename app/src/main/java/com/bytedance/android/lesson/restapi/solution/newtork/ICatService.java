package com.bytedance.android.lesson.restapi.solution.newtork;


import com.bytedance.android.lesson.restapi.solution.bean.Cat;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Xavier.S
 * @date 2019.01.15 16:42
 */
public interface ICatService {

    //两种写法

    @GET("v1/images/search?limit=5") Call<List<Cat>> getCall();
//    @GET("v1/images/search") Call<List<Cat>> randomCat(@Query("limit") int my_limit);
    // TODO-C1 (2) Implement your Cat Request here, url: https://api.thecatapi.com/v1/images/search?limit=5
}
