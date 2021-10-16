package Map61B;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayMap<K, V>  implements Map61B<K, V>{

    private K[] keys;
    private V[] values;

    int size = 0;

    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    //EFFECTS: Returns the index of the key if it exists; -1 otherwise
    public int keyIndex(K key){
        for (int i =0; i < size; i++){
            if(keys[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean containsKey(K key){
        int index = keyIndex(key);

        return index > -1;
    }

    public void put(K key, V value){
        int index = keyIndex(key);

        if(index == -1){
            keys[size] = key;
            values[size] = value;
            size += 1;
            return;
        }

        values[index] = value;
        keys[index] = key;
    }

    @Override
    public V get(K key){
        int index = keyIndex(key);
        return values[index];
    }

    @Test
    public void test(){
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5);
        int expected = 5;
        org.junit.Assert.assertEquals((Integer) expected, am.get(2));
    }

    @Override
    public List<K> keys() {
        List<K> keyList = new ArrayList<>();

        for (int i = 0; i < size; i++){
            keyList.add(keys[i]);
        }

        return keyList;
    }
}
