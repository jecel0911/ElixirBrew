package com.elixirbrew.jceciliano.elixirbrew.services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.elixirbrew.jceciliano.elixirbrew.common.Constants.BREWERY_API;

/**
 * Created by jceciliano on 21/12/16.
 */

public class ServiceGenerator {

    static HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(logging);

    private static Retrofit.Builder RETROFIT =
            new Retrofit.Builder()
                    .baseUrl(BREWERY_API)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            ;

    public static  <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = RETROFIT.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }

    private static final BeerService BEER_SERVICE = createService(BeerService.class);

    public static BeerService getBeerService() {
        return BEER_SERVICE;
    }


}

