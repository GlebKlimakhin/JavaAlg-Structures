package Trees;

import java.util.NoSuchElementException;

public class MyTreeMap<Key extends Comparable<Key>, Value> {
    private Node root;
    private String name;

    private class Node{
        Key key;
        Value value;
        Node leftChild;
        Node rightChild;
        int size;
        int height;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.size = 1;
            this.height = 0;
        }
    }
    public Node getNode(){
        return this.root;
    }

    private int size(Node node){
        if(node == null){
            return 0;
        }
        return node.size;
    }

    private int setSize(Node node){
        return size(node.leftChild) + size(node.rightChild) + 1;
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    public int size(){
        return size(root);
    }

    public boolean isEmpty(){
        return root == null;
    }

    private void checkIllegalKey(Key key){
        if(key == null){
            throw new IllegalArgumentException("Key cannot be null!");
        }
    }

    public boolean contains(Key key){
        return get(key) != null;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        checkIllegalKey(key);
        if(node == null){
            return null;
        }
        int temp = key.compareTo(node.key);
        if(temp == 0){
            return node.value;
        }
        else if(temp > 0){
           return get(node.rightChild, key);
        }
        else{
           return get(node.leftChild, key);
        }
    }

    public void insert(Key key, Value value){
        checkIllegalKey(key);
        if(value == null){
            return;
        }
        root = insert(root, key, value);
    }

    private Node insert(Node node, Key key, Value value){
        if(node == null){
            return new Node(key, value);
        }
        int temp = key.compareTo(node.key);
        if(temp == 0){
            node.value = value;
        }
        else if(temp > 0){
            node.rightChild = insert(node.rightChild, key, value);
        }
        else{
            node.leftChild = insert(node.leftChild, key, value);
        }
        node.size = setSize(node);

        checkBalance(node);
        return node;
    }

    public Key minKey(){
        return min(root).key;
    }

    private Node min(Node node){
        if(node.leftChild == null){
            return node;
        }
        else{
            return min(node.leftChild);
        }
    }

    public Key maxKey(){
        return max(root).key;
    }

    private Node max(Node node){
        if(node.rightChild == null){
            return node;
        }
        else{
            return max(node.rightChild);
        }
    }

    public void deleteMin(){
        if (isEmpty()){
            throw new NoSuchElementException("Map is empty, nothing to delete");
        }
        root = deleteMin(root);
    }

    private Node deleteMin(Node node){
        if(node.leftChild == null){
            return node.rightChild;
        }
        node.leftChild = deleteMin(node.leftChild);
        node.size = setSize(node);
        return node;
    }

    public void deleteMax(){
        if(isEmpty()){
            throw new NoSuchElementException("Map is empty, nothing to delete");
        }
        root = deleteMax(root);
    }

    private Node deleteMax(Node node) {
        if(node.rightChild == null){
            return node;
        }
        node.rightChild = deleteMax(node);
        node.size = setSize(node);
        return node;
    }

    public void delete(Key key){
        checkIllegalKey(key);
        root = delete(root, key);
    }

    private Node delete(Node node, Key key){
        if(node == null){
            return null;
        }
        int temp = key.compareTo(node.key);
        if(temp < 0){
            node.leftChild = delete(node.leftChild, key);
        }
        else if(temp > 0){
            node.rightChild = delete(node.rightChild, key);
        }
        else {
            if(node.leftChild == null){
                return node.rightChild;
            }
            if(node.rightChild == null){
                return node.leftChild;
            }
            Node container = node;
            node = min(node.rightChild);
            node.rightChild = deleteMin(container.rightChild);
            node.leftChild = container.leftChild;
        }
        node.size = setSize(node);

        checkBalance(node);
        return node;
    }

    private void checkBalance(Node node){
        if (node.leftChild == null && node.rightChild == null) {
            node.height = 0;
        } else if (node.leftChild != null && node.rightChild == null) {
            node.height = node.leftChild.height + 1;
        } else if (node.leftChild == null) {
            node.height = node.rightChild.height + 1;
        } else if (node.leftChild.height > node.rightChild.height) {
            node.height = node.leftChild.height + 1;
        } else if (node.leftChild.height < node.rightChild.height) {
            node.height = node.rightChild.height + 1;
        } else {
            node.height = node.leftChild.height + 1;
        }
    }

    public boolean isBalanced(){
        if(root == null || size(root) == 1){
            return true;
        }
        else{
            int leftHeight;
            int rightHeight;
            leftHeight = height(root.leftChild);
            rightHeight = height(root.rightChild);
            return Math.abs(leftHeight - rightHeight) <= 1;
        }
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.leftChild) + " " +
                node.key + " <--> " + node.value + "; " +
                toString(node.rightChild);
    }
}
