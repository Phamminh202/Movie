package com.example.movie.model;

import java.util.List;

public class Section {
    private String title;
    private List<Movie> listMovies;

    public Section(String title, List<Movie> listMovies) {
        this.title = title;
        this.listMovies = listMovies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Movie> getListMovies() {
        return listMovies;
    }

    public void setListMovies(List<Movie> listMovies) {
        this.listMovies = listMovies;
    }
}
