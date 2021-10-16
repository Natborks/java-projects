package models;

public class VengefulSLList <Item> extends SLList<Item> {
    private SLList<Integer> deletedItems;

    public VengefulSLList(){
        deletedItems = new SLList<>();
    }
    public void printDeleteItems(){
        deletedItems.printList();
    }

    @Override
    public Item removeLast(){
        Item x = super.removeLast();
        deletedItems.addLast(x);

        return x;
    }
    public static void main(String[] args) {
        VengefulSLList<Integer> vList = new VengefulSLList();
        vList.addLast(3);
        vList.addLast(4);
        vList.addLast(5);
        vList.addLast(13);

        vList.removeLast();
        vList.removeLast();
        vList.printDeleteItems();
    }

}
