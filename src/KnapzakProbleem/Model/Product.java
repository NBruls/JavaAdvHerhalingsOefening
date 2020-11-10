package KnapzakProbleem.Model;

import KnapzakProbleem.Interfaces.Item;

public class Product implements Item<Product>, Comparable<Product>{
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Product p) {
        return Double.compare(p.getPrice(), price);
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nWeight: %.2f\nPrice: $%.2f", name, weight, price);
    }
}
