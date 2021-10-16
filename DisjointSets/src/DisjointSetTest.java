import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisjointSetTest {

    DisjointSet disjointSet;
    @Before
    public void setup(){
       disjointSet = new DisjointSet(8);
    }
    @Test
    public void testFind(){


        int root4 = disjointSet.find(4);
        int root5 = disjointSet.find(5);

        Assert.assertEquals(4, root4);
        Assert.assertEquals(5, root5);

        disjointSet.union(4, 5);

        root4 = disjointSet.find(4);
        Assert.assertEquals(5, root4);
    }

    @Test
    public void testUnion(){
       disjointSet.union(3, 4);
    }

    @Test
    public void voidTestisConnected(){
        boolean isConnected4and5 = disjointSet.isConnected(4, 5);

        Assert.assertFalse(isConnected4and5);
    }
}
