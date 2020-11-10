package KnapzakProbleem.Model;

import KnapzakProbleem.Interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item> {
    private List<T> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void add(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }
}
