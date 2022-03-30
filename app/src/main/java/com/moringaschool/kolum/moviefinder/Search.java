package com.moringaschool.kolum.moviefinder;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.moringaschool.kolum.moviefinder.databinding.SearchBinding;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.moringaschool.kolum.moviefinder.databinding.SearchBinding binding = SearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.discoverButton.setOnClickListener(view -> {
            Intent intentLoadDiscoverActivity = new Intent(Search.this, Discover.class);
            startActivity(intentLoadDiscoverActivity);
        });
        binding.discoverButton.setOnClickListener(view -> {
            Intent intentLoadSearchActivity = new Intent(Search.this, Discover.class);
            startActivity(intentLoadSearchActivity);
        });
    }

}
