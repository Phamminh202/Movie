package com.example.movie.model;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private String thumbnail;

    public Movie() {
    }

    public Movie(String name, String thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
