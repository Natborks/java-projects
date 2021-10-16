package models;

public class SLList {
    //the first item, if it exists, is at sentinel.next
    private IntNode sentinel;
    private int size;

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    public SLList(int x) {
        sentinel = new IntNode(0000, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /**
     * Creates an empty SLList
     */
    public SLList(){
        sentinel = new IntNode(0000, null);
        size = 0;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public int size(){
        return size;
    }

    public void addLast (int x){
        size++;

        addLast(sentinel, x);

    }

    private static void addLast(IntNode p, int x){

        if (p.next == null)
            p.next = new IntNode(x, null);
        else
            addLast(p.next, x);
    }
}
