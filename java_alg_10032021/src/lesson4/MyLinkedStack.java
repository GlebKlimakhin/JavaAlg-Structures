package lesson4;

import java.util.NoSuchElementException;

public class MyLinkedStack<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();

    public void push(T item){
        ll.insertFirst(item);
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return ll.getFirst();
    }

    public T pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return ll.removeFirst();
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }
}
