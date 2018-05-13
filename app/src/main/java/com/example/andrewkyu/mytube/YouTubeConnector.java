package com.example.andrewkyu.mytube;


import android.content.Context;
import android.util.Log;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;

import java.io.IOException;

public class YouTubeConnector {
    private YouTube youtube;
    private YouTube.Search.List query;

    public static final String KEY = "AIzaSyBLEndthMOIRMJAOxGX-nP9ZgZTzKcabZ4";

    public YouTubeConnector(Context context){
        youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest httpRequest) throws IOException {}
        }).setApplicationName(context.getString(R.string.app_name)).build();

        try{
            query = youtube.search().list("id, snippet");
            query.setKey(KEY);
            query.setType("video");
            query.setFields("items(id/videoID, snippet/title, snippet/description, snippet/thumbnails/default/url");
        }catch(IOException e){
            Log.d("YC", "Could not initialize: "+e);
        }
    }

}
