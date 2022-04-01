package com.moringaschool.kolum.moviefinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.moringaschool.kolum.moviefinder.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.discoverButton.setOnClickListener(this);
        binding.searchButton.setOnClickListener(this);
        binding.homeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == binding.discoverButton){
            Intent intentLoadDiscoverActivity = new Intent(MainActivity.this, Discover.class);
            startActivity(intentLoadDiscoverActivity);
        }else if (view == binding.searchButton){
            Intent intentLoadDiscoverActivity = new Intent(MainActivity.this, Search.class);
            startActivity(intentLoadDiscoverActivity);
        }else {
            Toast.makeText(this,"You are on home page",Toast.LENGTH_SHORT).show();
        }

    }
}
