package com.moringaschool.kolum.moviefinder.models;

import org.json.JSONObject;

import java.util.ArrayList;

public class apiResponse {
    private int page;
    private ArrayList<JSONObject> results;
    private int total_pages;
    private int total_results;

    public apiResponse(int page, ArrayList<JSONObject> results, int total_pages, int total_results) {
        this.page = page;
        this.results = results;
        this.total_pages = total_pages;
        this.total_results = total_results;
    }

    public int getPage() {
        return page;
    }

    public ArrayList<JSONObject> getResults() {
        return results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }
}
