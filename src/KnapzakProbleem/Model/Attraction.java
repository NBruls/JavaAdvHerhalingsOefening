package KnapzakProbleem.Model;

import KnapzakProbleem.Interfaces.Item;

public class Attraction implements Item<Attraction>, Comparable<Attraction>{
    private String name;
    private double days;
    private int rating;

    public Attraction(String n, double d, int r){
        name = n;
        days = d;
        rating = r;
    }

    @Override
    public double getWeight() {
        return days;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nDays: %.1f\nRating: %d", name, days, rating);
    }

    @Override
    public int compareTo(Attraction a) {
        return Integer.compare(a.rating, this.rating);
    }
}
