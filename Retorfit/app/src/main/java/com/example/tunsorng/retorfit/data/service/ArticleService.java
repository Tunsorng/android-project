package com.example.tunsorng.retorfit.data.service;

import com.example.tunsorng.retorfit.model.response.Article;
import com.example.tunsorng.retorfit.model.response.ArticleResonse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ArticleService {
    @POST("/v1/api/articles")
    Call<Article>
    addArticle(
            @Body com.example.tunsorng.retorfit.model.form.Article article
    );


}
