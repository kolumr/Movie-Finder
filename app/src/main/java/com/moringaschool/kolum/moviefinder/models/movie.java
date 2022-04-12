package com.moringaschool.kolum.moviefinder.models;

public class movie {
    private final int id;
    private final boolean adult;
    private final String overview;
    private final String release_date;
    private final String original_title;
    private final String original_language;
    private final String title;
    private final String popularity;
    private final String vote_average;

    public movie(int id, boolean adult, String overview, String release_date, String original_title, String original_language, String title, String popularity, String vote_average) {
        this.id = id;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
        this.original_title = original_title;
        this.original_language = original_language;
        this.title = title;
        this.popularity = popularity;
        this.vote_average = vote_average;
    }

    public int getId() {
        return id;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getTitle() {
        return title;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getVote_average() {
        return vote_average;
    }
}
