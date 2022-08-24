package com.example.movie.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.movie.R;
import com.example.movie.model.Movie;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Movie movie = (Movie) getIntent().getSerializableExtra("MOVIE");
        TextView tvTitle = findViewById(R.id.tvTitle);
        ImageView ivCover = findViewById(R.id.ivCover);
        tvTitle.setText(movie.getName());
        Glide.with(this).load(movie.getThumbnail()).into(ivCover);
    }
}