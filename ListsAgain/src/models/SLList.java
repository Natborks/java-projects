package models;

public class SLList<Item> implements ListInterface<Item>{
    //the first item, if it exists, is at sentinel.next
    private Node sentinel;
    private int size;

    private static class Node<Item> {
        public Item item;
        public Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public SLList(Item x) {
        sentinel = new Node(0000, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    /**
     * Creates an empty SLList
     */
    public SLList(){
        sentinel = new Node(0000, null);
        size = 0;
    }

    public Item getFirst(){
        return (Item) sentinel.next.item;
    }

    public int size(){
        return size;
    }

    @Override
    public Item removeLast() {
        Node p = sentinel.next;
        while (p.next.next != null){
            p = p.next;
        }
        Item returnValue = (Item) p.next.item;
        p.next = null;
        size -= 1;

        return returnValue;
    }

    @Override
    public void addFirst(Object x) {
        sentinel.next = new Node(x, sentinel.next);
        size++;
    }


    @Override
    public void addLast(Object x) {
        size++;

        addLast(sentinel, (Item) x);
    }

    @Override
    public Item getLast() {
        return null;
    }

    public Item get(int count) {
        Node<Item> current = sentinel.next;
        int counter = 0;
        while(current != null){
            if(count == counter)
                return current.item;
            else
                current = current.next;
            counter += 1;
        }

        return null;
    }

    private void addLast(Node p, Item x){

        if (p.next == null)
            p.next = new Node(x, null);
        else
            addLast(p.next, x);
    }

    @Override
    public void printList(){
        for(Node p = sentinel.next; p != null; p = p.next){
            System.out.println(p.item + " ");
        }
    }
}
