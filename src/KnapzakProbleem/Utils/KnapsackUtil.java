package KnapzakProbleem.Utils;

import KnapzakProbleem.Exceptions.KnapsackFullException;
import KnapzakProbleem.Interfaces.Item;
import KnapzakProbleem.Model.Inventory;
import KnapzakProbleem.Model.Knapsack;
import KnapzakProbleem.Model.Product;

import java.util.*;

public class KnapsackUtil {
   public static <T extends Item<T> & Comparable<T>> void fill(Knapsack<T> k,Inventory<T> i){
       List<T> sortedItems = i.getItems();
       Collections.sort(sortedItems);
       Iterator<T> iterator = sortedItems.listIterator();
       while(iterator.hasNext()){
           T item = iterator.next();
           try{
               k.add(item);
           } catch(KnapsackFullException e){
               String m = e.getMessage();
           }
       }
   }
}
