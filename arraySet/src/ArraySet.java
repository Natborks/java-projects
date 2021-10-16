import java.util.*;

public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size; // the next item to be added will be at position size

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map. */
    public void add(T x) {
        if(x == null){
            throw new IllegalArgumentException("can't add null");
        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        if(obj.getClass() != this.getClass())
            throw new IllegalArgumentException("Classes are not equal");

        ArraySet o = (ArraySet<T>) obj;

        if(o.size != this.size)
            return false;

        for (T item : this){
            if(! o.contains(item))
                return false;
        }

        return true;
    }

//    @Override
//    public String toString() {
//        StringBuilder returnString = new StringBuilder("{");
//
//        for(T item : this){
//            returnString.append(item.toString());
//            returnString.append(", ");
//        }
//
//        returnString.append("}");
//
//        return returnString.toString();
//    }

    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();

        for (T item : this){
            listOfItems.add(item.toString());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(String.join(", ", listOfItems));
        sb.append("}");

        return sb.toString();
    }

    public static <T> ArraySet<T> of(T ... stuff){
        ArraySet<T> returnSet = new ArraySet<>();

        for (T item : stuff){
            returnSet.add(item);
        }

        return returnSet;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T>{

        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public T next() {
            T currentItem = items[pos];
            pos += 1;
            return currentItem;
        }
    }

    public static void main(String[] args) {
        ArraySet<String> arraySet = new ArraySet<>();
        arraySet.add("Tokyo");
        arraySet.add("Jungle");

        ArraySet<String> arraySet2 = new ArraySet<>();
        arraySet2.add("Tokyo");
        arraySet2.add("Jungle");

        System.out.println(arraySet);
        System.out.println(arraySet.equals(arraySet2));

        ArraySet arraySet1 = ArraySet.of("hi", "I'm", "here");
        System.out.println(arraySet1);
    }
}
