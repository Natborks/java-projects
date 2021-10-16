package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTTest {
    BST<String, String> bst;
    @Before
    public void setup(){
        bst = new BST<>("S", "S");

        bst.insert("E", "E");
        bst.insert("A", "A");
        bst.insert("R", "R");
        bst.insert("H", "H");

    }

    @Test
    public void testSelect(){
        String key = bst.select(2);

        Assert.assertEquals("H", key);
    }

    @Test
    public void testDeleteMind(){
        BST<String, String> bst = new BST<>("S", "S");

        bst.insert("E", "E");
        bst.insert("R", "R");
        bst.insert("A", "A");
        bst.insert("H", "H");

        Assert.assertEquals(5, bst.size());
        
        bst.deleteMin();

        String min = bst.min();


        Assert.assertEquals("E", min);


        Assert.assertEquals(4, bst.size());
    }


    @Test
    public void testDeleteTreeWithOnlyRoot(){
        String min = bst.min();
        Assert.assertEquals("S", min);

        bst.deleteMin();

        String value = bst.get("S");

        Assert.assertNull(value);
    }

    @Test
    public void testDeleteRoot(){

    }
}
