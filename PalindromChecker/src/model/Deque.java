package model;

public class Deque<T> {

    private Node<T> sentinel;
    private int size;

    private static class Node<T> {
        public Node next;
        public Node previous;
        public T item;

        public Node(Node next, Node previous, T item) {
            this.next = next;
            this.previous = previous;
            this.item = item;
        }
    }

    public Deque(){
        sentinel = new Node(null, null, 97);
        sentinel.next = sentinel;
        sentinel.previous = sentinel;
        size = 0;
    }

    //MODIFIES: this;
    //EFFECT: add item to the front of the deque
    public void addFirst(T item){
        sentinel.next.previous = new Node(sentinel.next, sentinel, item);
        sentinel.next = sentinel.next.previous;
        size++;
    }

    //MODIFIES: this
    //EFFECT: Add item to the end of the deque
    public void addLast(T item){
        sentinel.previous.next = new Node(sentinel, sentinel.previous, item);
        sentinel.previous = sentinel.previous.next;
        size++;
    }

    //EFFECT: returns true if the deque is empty. False otherwise
    public boolean isEmpty(){
        return size == 0;
    }

    //EFFECT: returns the size of the deque
    public int size(){return size;}

    //EFFECT: Print all items in the deque from first to last
    public void printDeque(){

        printDeque(sentinel.next);

    }

    private void printDeque(Node p){
        if (p == sentinel)
            return;

        System.out.println(p.item);

        printDeque(p.next);
    }

    //MODIFIES: This
    //EFFECT: removes the first item in the deque
    //        returns the first item in the deque
    public T removeFirst (){
        Node<T> toRemove = sentinel.next;

        sentinel.next = toRemove.next;
        toRemove.next.previous = sentinel;
        toRemove.next = null;
        toRemove.previous = null;
        size--;

        return toRemove.item;
    }

    //MODIFIES: This
    //EFFECT: Removes the last item from the deque
    //        returns the last item in the deque
    public T removeLast(){
        Node<T> toRemove = sentinel.previous;

        sentinel.previous = toRemove.previous;
        toRemove.previous.next = sentinel;
        toRemove.next = null;
        toRemove.previous = null;
        size--;
        return toRemove.item;
    }

    //EFFECT: Returns the item at position index in the deque
    public T get(int index){

        return get(index, sentinel.next, 0);
    }

    private T get(int index, Node p, int count){

        if (count == index){
            return (T) p.item;
        }else
        {
            count++;
            return get(index, p.next, count);
        }
    }

}
