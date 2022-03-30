package com.moringaschool.kolum.moviefinder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.moringaschool.kolum.moviefinder.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.moringaschool.kolum.moviefinder.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.discoverButton.setOnClickListener(view -> {
            Intent intentLoadDiscoverActivity = new Intent(MainActivity.this, Discover.class);
            startActivity(intentLoadDiscoverActivity);
        });
        binding.searchButton.setOnClickListener(view -> {
            Intent intentLoadSearchActivity = new Intent(MainActivity.this, Search.class);
            startActivity(intentLoadSearchActivity);
        });
        binding.homeButton.setOnClickListener(view -> Toast.makeText(this, "You are already on Home page", Toast.LENGTH_SHORT).show());
    }

}