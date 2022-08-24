package com.example.movie.model;

public class Api {
    private Data data;

    public Api() {
    }

    public Api(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
