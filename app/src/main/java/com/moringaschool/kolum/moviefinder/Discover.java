package com.moringaschool.kolum.moviefinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.moringaschool.kolum.moviefinder.databinding.DiscoverBinding;

import java.util.ArrayList;

public class Discover extends AppCompatActivity implements View.OnClickListener{
    DiscoverBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DiscoverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.discoverButton.setOnClickListener(this);
        binding.searchButton.setOnClickListener(this);
        binding.homeButton.setOnClickListener(this);
        String [] movies = {"Panari", "Weston", "Kempinski"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, movies);
        binding.listView.setAdapter(adapter);
    }
    @Override
    public void onClick(View view) {
        if (view == binding.homeButton) {
            Intent intentActivity = new Intent(Discover.this, MainActivity.class);
            startActivity(intentActivity);
        } else if (view == binding.searchButton) {
            Intent intentActivity = new Intent(Discover.this, Search.class);
            startActivity(intentActivity);
        } else {
            Toast.makeText(this, "You are on Discover page", Toast.LENGTH_SHORT).show();
        }
    }

}
