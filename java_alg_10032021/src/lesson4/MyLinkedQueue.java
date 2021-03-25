package lesson4;

import java.util.NoSuchElementException;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();

    public void push(T item){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ll.insertLast(item);
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return ll.getLast();
    }

    public T pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return ll.removeLast();
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }
}
