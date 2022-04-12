package com.moringaschool.kolum.moviefinder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.moringaschool.kolum.moviefinder.databinding.ActivityMainBinding;
import com.moringaschool.kolum.moviefinder.models.apiResponse;
import com.moringaschool.kolum.moviefinder.network.MovieApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


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
        String url = "https://api.themoviedb.org/3/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieApi movieApi = retrofit.create(MovieApi.class);
        Call<apiResponse> call = movieApi.getResponse();
        call.enqueue(new Callback<apiResponse>() {
            @Override
            public void onResponse(Call<apiResponse> call, Response<apiResponse> response) {
                apiResponse movies = response.body();
                if (!response.isSuccessful()) {
                    Toast toast = Toast.makeText(MainActivity.this,
                            "failure",
                            Toast.LENGTH_LONG);

                    toast.show();
                }
                Toast toast = Toast.makeText(MainActivity.this,
                        movies.getResults().toString(),
                        Toast.LENGTH_LONG);

                toast.show();
            }

            @Override
            public void onFailure(Call<apiResponse> call, Throwable t) {
                Toast toast = Toast.makeText(MainActivity.this,
                        "Error fetching data",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });

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
