public class DisjointSet {
    private int[] N;
    private int totalSetSize;

    public DisjointSet(int n){
        N = new int[n];

        for (int i = 0; i < n; i++) {
            N[i] = -1;
        }

        totalSetSize = n;
    }

    /**
    * Returns the root of the set v1 belongs to.
    * */
    public int find(int v1){
        validate(v1);

        if (N[v1] < -0)
            return v1;
        else
            return find(v1);
    }

    /**
    * Returns true if nodes v1 and v2 are connected.
    * */
    public boolean isConnected(int v1, int v2){
        return false;
    }

    /**
    * Connects two elements v1 and v2 together. v1
    * */
    public void union(int v1, int v2){
        return;
    }

    /**
    * Returns the parent of v1. If v1 is the root of a tree,
    * returns the negative size of the tree for which v1 is the root.
    * */
    public int parent(int v1){
        return 0;
    }

    /**
    * Returns the size of the set v1 belongs to
    * */
    public void sizeOf(int v1){

    }

    /**
     * Throws an exception if v1 is not a valid index
     * */
    public void validate(int v1){
        if (totalSetSize < v1)
            throw new IllegalArgumentException("Invalid Index");
    }
}
