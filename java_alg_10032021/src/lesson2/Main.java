package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> ints = new MyArrayList<>(100000);
        for (int i = 0; i < ints.getCapacity(); i++) {
            ints.add((int)(Math.random()*i));
        }
        sort2(ints);
    }


    public static void sort1(MyArrayList<Integer> a){//11.071 sec
        long curtime = System.currentTimeMillis();
        a.selectionSort();
        System.out.println(System.currentTimeMillis() - curtime);
    }

    public  static void sort2(MyArrayList<Integer> a){// 2.05 - 2.548 sec
        long curtime = System.currentTimeMillis();
        a.insertionSort();
        System.out.println(System.currentTimeMillis() - curtime);
    }

    public static void sort3(MyArrayList a){ // 30 sec
        long curtime = System.currentTimeMillis();
        a.bubbleSortO();
        System.out.println(System.currentTimeMillis() - curtime);
    }

    public static void sort3OPT(MyArrayList<Integer> a){ //28 sec
        long curtime = System.currentTimeMillis();
        a.bubbleSortO();
        System.out.println(System.currentTimeMillis() - curtime);
    }
}
