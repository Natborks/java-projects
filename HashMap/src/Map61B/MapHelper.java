package Map61B;

import org.junit.Test;

import java.util.List;

public class MapHelper {

    public static <K, V> V get(Map61B<K, V> sim, K key){
        if (sim.containsKey(key)){
            return sim.get(key);
        }

        return null;
    }

    //EFFECTS: returns the largest key among the keys in the map.
    public static <K extends Comparable<K>, V> K maxKey(Map61B<K, V> map){
        //In the method signature, we're adding K extends comparable
        // to show that the K value will be an iterable
        List<K> keyList = map.keys();

        K largest = keyList.get(0);

        for (K key : keyList){
            if(key.compareTo(largest) > 0)
                largest = key;
        }
        return largest;
    }

    @Test
    public void testGet(){
        Map61B<String, Integer> map61B = new ArrayMap<String, Integer>();

        map61B.put("Horse", 4);
        map61B.put("Hen", 3);

        System.out.println(maxKey(map61B));

        Integer result = get(map61B, "Horse");
        Integer expected = 4;
        org.junit.Assert.assertEquals(expected, result);
    }
}
