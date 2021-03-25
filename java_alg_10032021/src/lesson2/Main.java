package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arr[i] *=3;
//            }
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        for (String s : strarr) {
//            System.out.print(s);
//        }


//        String[] strarr = {"asd", "zxc", "qwe"};
//
//        System.out.println(Arrays.toString(strarr));
//
////        for (int i = 0; i < strarr.length; i++) {
////            strarr[i] += "0";
////        }
//
//        for (String s : strarr) {
//            s += "0";
//        }
//
//        System.out.println(Arrays.toString(strarr));


//        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 2, 3, 56, 2, 4, 3, 2));

//        System.out.println(list);
////        list.removeIf(i -> i == 2);
////        list.removeAll(Arrays.asList(2));
////        list.replaceAll(i -> i*i);
////        list.remove((Integer) 2);
//
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(8);
//        mal.add(2);
//        System.out.println(mal);
//
//        mal.add(1, 99);
//        System.out.println(mal);
//
////        System.out.println(mal.remove(2));
//        System.out.println(mal.remove((Integer) 99));
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(1);
//        msal.add(8);
//        msal.add(2);
//        msal.add(3);
//        System.out.println(msal);
//        msal.add(4);
//        System.out.println(msal);
//        System.out.println(msal.binaryIndexOf(1));


        MyArrayList<Integer> mal = new MyArrayList<>(50000);
        for (int i = 0; i < 50000; i++) {
            mal.add(r.nextInt(1000 ) + i );
        }
        System.out.println(mal);

        long begin = System.currentTimeMillis();

//        mal.selectionSort(); // 3584
//        mal.insertionSort(); // 1614
//        mal.bubbleSort();    //9500
//        mal.bubbleSortO();
//        mal.qSort(); // 47


        long end = System.currentTimeMillis();
        System.out.printf("Time:  %d ms\n", end - begin);

//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            msal.add(r.nextInt(10));
//        }
//        System.out.println(msal);
//
//        System.out.println(msal.recFind(5));

    }
}
