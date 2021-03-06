package com.rakesh.nytimessearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rparuthi on 3/17/2017.
 */

public class Article {
    @SerializedName("headline")
    @Expose
    private Headline headline;

    @SerializedName("multimedia")
    @Expose
    private List<Multimedium> multimedia = null;

    @SerializedName("web_url")
    @Expose
    private String webUrl;

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public List<Multimedium> getMultimedia() {
        return multimedia;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

}

