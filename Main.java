package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;

public class Main {

      public static void main(String[] args) throws IOException {
        OkHttpClient client =  new OkHttpClient();
        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5days")
                .addPathSegment("474212_PC")
                .addQueryParameter("apikey", "HBAoYTHBeloWennir9bjrNSNYgoGaCqz")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        //System.out.println(url.toString());

        // При необходимости указать заголовки
        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.isSuccessful());
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }

}