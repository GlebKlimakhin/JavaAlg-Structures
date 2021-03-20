package lesson3;

public class ReverseString {
    public static void main(String[] args) {
        reveseViaStack("java");
        reverseViaArray("avaj");
        MyDeque<Integer> deque = new MyDeque<>(10);

    }
    private static void reveseViaStack(String str){
        long a = System.currentTimeMillis();
        MyStack<String> chars = new MyStack<>();
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            chars.push(String.valueOf(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(chars.pop());
        }
        System.out.println();
        System.out.println(System.currentTimeMillis()-a);
    }

    private static void reverseViaArray(String str){
        long a = System.currentTimeMillis();
        char [] arr = str.toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - a);
        //Быстрее, чем первый метод
    }

}
