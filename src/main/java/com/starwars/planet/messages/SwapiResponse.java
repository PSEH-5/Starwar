package com.starwars.planet.messages;

import java.util.ArrayList;
import java.util.Map;

public class SwapiResponse {

    private int count;
    private String next;
    private ArrayList<Result> results;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public SwapiResponse() {
    }

    public SwapiResponse(int count, String next, ArrayList<Result> results) {
        this.count = count;
        this.next = next;
        this.results = results;
    }
}


