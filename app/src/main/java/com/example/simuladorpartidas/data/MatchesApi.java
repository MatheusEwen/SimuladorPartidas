package com.example.simuladorpartidas.data;

import com.example.simuladorpartidas.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();

}
