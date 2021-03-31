package CodeWars;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "";
        System.out.println(Arrays.toString(method(str)));   
    }

    public static String[] method(String str) {
        if(str.length() == 0){
            return new String[]{};
        }
        String[] finalArr = new String[str.length() % 2 == 0  ? str.length()/2 : str.length()/2 + 1];
        char[] arr = new char[str.length()];
        arr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if(i != arr.length - 1)
            finalArr[counter++] = String.valueOf(arr[i]) + String.valueOf(arr[i + 1]);
            else
                finalArr[counter++] = String.valueOf(arr[i]);
        }
        if (finalArr[counter - 1].length() == 1) {
            finalArr[counter - 1] += '_';
        }
        return finalArr;
    }
}