package com.example.demo;

public class Chart {
    private int id;
    private String name;
    private String[] days;

    public Chart(int id, String name, String[] days) {
        this.id = id;
        this.name = name;
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getDays() {
        return days;
    }
}
