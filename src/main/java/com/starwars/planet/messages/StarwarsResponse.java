package com.starwars.planet.messages;

import java.util.ArrayList;

public class StarwarsResponse {

    private String type;
    private int count;
    private String name;
    private ArrayList<String> films;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<String> films) {
        this.films = films;
    }

    public StarwarsResponse() {
    }

    public StarwarsResponse(String type, int count, String name, ArrayList<String> films) {
        this.type = type;
        this.count = count;
        this.name = name;
        this.films = films;
    }
}
