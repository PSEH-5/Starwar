package com.starwars.planet.messages;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Result {

    private String name;
    private ArrayList<String> films;

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


    public Result() {
    }

    public Result(String name, ArrayList<String> films) {
        this.name = name;
        this.films = films;
    }
}
