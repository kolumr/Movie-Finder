package com.moringaschool.kolum.moviefinder;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.moringaschool.kolum.moviefinder.databinding.ActivityMainBinding;

public class Discover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.moringaschool.kolum.moviefinder.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.homeButton.setOnClickListener(view -> {
            Intent intentLoadDiscoverActivity = new Intent(Discover.this, MainActivity.class);
            startActivity(intentLoadDiscoverActivity);
        });
        binding.searchButton.setOnClickListener(view -> {
            Intent intentLoadSearchActivity = new Intent(Discover.this, Search.class);
            startActivity(intentLoadSearchActivity);
        });
    }

}
