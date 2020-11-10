package KnapzakProbleem.Model;

import KnapzakProbleem.Exceptions.KnapsackFullException;
import KnapzakProbleem.Interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<T extends Item> {
    private double maximumCapacity;
    private List<T> items = new ArrayList<>();

    public Knapsack(double maxCap){
        maximumCapacity = maxCap;
    }

    public void add(T item) throws KnapsackFullException {
        if(getCurrentWeight() + item.getWeight() <= maximumCapacity){
            items.add(item);
        } else {
            throw new KnapsackFullException(String.format("Could not add item: \n%s\nMaximum weight is %.1f\n", item, item.getWeight()));
        }
//        try {
//            if (getCurrentWeight() + item.getWeight() > maximumCapacity) {
//                throw new KnapsackFullException("Cannot add " + item + ". Maximum weight is " + maximumCapacity + ".");
//            } else {
//                items.add(item);
//            }
//        }
//        catch(KnapsackFullException e){
//            System.out.println(e.getMessage());
//        }
    }

    public double getCurrentWeight(){
        double sum = 0;
        for (T item:items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public List<T> getItems(){
        return items;
    }
}
