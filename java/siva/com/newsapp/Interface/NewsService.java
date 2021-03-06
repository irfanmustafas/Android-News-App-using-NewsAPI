package siva.com.newsapp.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;
import siva.com.newsapp.Model.News;
import siva.com.newsapp.Model.WebSite;

/**
 * Created by MANIKANDAN on 16-11-2017.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);

}
