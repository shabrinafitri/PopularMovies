package com.example.shabrinafitri.popularmovie.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shabrinafitri on 16/12/17.
 */

public class Server {

    public final static String BASE_URL = "http://api.themoviedb.org";

    private static Retrofit retrofit = null;

    public static Retrofit getClient()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
