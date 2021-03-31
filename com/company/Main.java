package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursion(4,1));
    }

    private static int recursion(int a, int n){
        if(a==0 && n<0){
            throw new IllegalArgumentException();
        }
        int result = 1;
        if(n == 0){
            return 1;
        }
        result = recursion(a, n/2);
        if(n % 2 == 0){
            return result * result;
        }
        else
            return result * result * a;
    }


}
