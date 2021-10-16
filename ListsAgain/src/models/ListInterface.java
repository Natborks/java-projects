package models;

//Interface inheritance and implementation inheritance
public interface ListInterface<Item> {
    /** Inserts X into the back of the list. */
    void addLast(Item x);

    /** Returns the item from the back of the list. */
    Item getLast();

    /** Gets the ith item in the list (0 is the front). */
    Item get(int i);

    /** Returns the number of items in the list. */
    int size();

    /** Deletes item from back of the list and
     * returns deleted item. */
    Item removeLast();

    void addFirst(Item x);

    default void printList(){
        for(int i =0; i < size(); i++){
            System.out.println(get(i));
        }
    }

}
