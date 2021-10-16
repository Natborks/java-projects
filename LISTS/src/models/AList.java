package models;

public class AList<Item> {
    private Item[] items;
    private int size;
    private final int initialSize;

    /** Creates an empty list. */
    public AList() {
        initialSize = 1000;
        items = (Item[]) new Object[initialSize];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if( size == items.length){
            resize();
        }

        items[size] = x;
        size ++;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {

        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i - 1];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        Item item = getLast();
        size--;
        items[size - 1] = null;
        return item;
    }

    public void resize() {
        Item[] a = (Item[]) new Object[2 * size];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
}
