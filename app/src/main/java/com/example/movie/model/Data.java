package com.example.movie.model;

import java.util.List;

public class Data {
    private List<Movie> trending;
    private List<Movie> hot;
    private List<Movie> popular;
    private List<Movie> upcoming;

    public Data(List<Movie> trending, List<Movie> hot, List<Movie> popular, List<Movie> upcoming) {
        this.trending = trending;
        this.hot = hot;
        this.popular = popular;
        this.upcoming = upcoming;
    }

    public Data() {
    }

    public List<Movie> getTrending() {
        return trending;
    }

    public void setTrending(List<Movie> trending) {
        this.trending = trending;
    }

    public List<Movie> getHot() {
        return hot;
    }

    public void setHot(List<Movie> hot) {
        this.hot = hot;
    }

    public List<Movie> getPopular() {
        return popular;
    }

    public void setPopular(List<Movie> popular) {
        this.popular = popular;
    }

    public List<Movie> getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(List<Movie> upcoming) {
        this.upcoming = upcoming;
    }
}
