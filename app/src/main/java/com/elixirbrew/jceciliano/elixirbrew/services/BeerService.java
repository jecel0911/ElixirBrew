package com.elixirbrew.jceciliano.elixirbrew.services;

import com.elixirbrew.jceciliano.elixirbrew.common.Constants;
import com.elixirbrew.jceciliano.elixirbrew.models.MBeersSearch;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jceciliano on 21/12/16.
 */

public interface BeerService {
    @GET(Constants.BEER_SEARCH)
    Observable<MBeersSearch> searchBeers(
            @Query(Constants.QUERY_SEARCH) String beer);

}
