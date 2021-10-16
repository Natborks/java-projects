package models;

public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int n;

        public Node(Key key, Value value, Node left, Node right, int N) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.n = N;
        }

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public BST(Key key, Value value) {
        this.root = new Node(key, value, null, null, 1);
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null)
            return 0;
        return node.n;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (key.compareTo(node.key) == 0)
            return node.value;
        else if (key.compareTo(node.key) < 0)
            return get(node.left, key);
        else if (key.compareTo(node.key) > 0)
            return get(node.right, key);
        else
            return null;
    }

    public Node insert(Key key, Value value) {
        return insert(root, key, value);
    }

    private Node insert(Node node, Key key, Value value) {
        // Change key’s value to val if key in subtree rooted at x.
        // Otherwise, add new node to subtree associating key with val.
        if (node == null) {
            return new Node(key, value, null, null, 1);
        }
        int cmp = key.compareTo(node.key);

        if (cmp < 0) {
            node.left = insert(node.left, key, value);
        } else if (cmp > 0) {
            node.right = insert(node.right, key, value);
        } else {
            node.value = value;
        }
        node.n = size(node.left) + size(node.right) + 1;

        return node;
    }

    public Key min() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.left == null)
            return node;

        return min(node.left);
    }

    public Key max() {
        return max(root);
    }

    private Key max(Node node) {
        if (node.right == null)
            return node.key;
        return max(node.right);
    }

    public Node floor(Key key) {
        return floor(root, key);
    }

    private Node floor(Node node, Key key) {
        if (node == null)
            return null;
        int compareTo = key.compareTo(node.key);
        if (compareTo == 0)
            return node;
        else if (compareTo < 0)
            return floor(node.left, key);
        else {
            Node compareNode = floor(node.right, key);
            if (compareNode == null)
                return node;
            else
                return compareNode;
        }

    }

    public Key select(int k) {
        return select(root, k).key;
    }

    private Node select(Node node, int k) {
        int t = size(node.left); //size of tree at node

        if (node == null)
            return null;

        if (t > k)
            return select(node.left, k);
        else if (t < k)
            return select(node.right, k - t - 1);
        else
            return node;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null)
            return node.right;

        node.left = deleteMin(node.left);
        node.n = size(node.left) + size(node.right) + 1;

        return node;

    }

    public void deleteMax() {
        root = deleteMax(root);
    }

    private Node deleteMax(Node node) {
        if (node.right == null)
            return node.left;

        node.right = deleteMax(node.right);
        node.n = size(node.left) + size(node.right) + 1;

        return node;
    }

    public void delete(Key key){
        root = delete(root, key);
    }

    private Node delete(Node node, Key key){
//        int comp = key.compareTo(node.key);
//
//        if (comp == 0){
//            if(node.left == null && node.right != null)
//                return node.right;
//            else if(node.right == null && node.left != null)
//                return node.left;
//            else if(node.left != null && node.right != null){
//                Node currNode = node;
//
//                Node x = min(currNode.right);
//
//                currNode.right = deleteMin(t.right);
//            }
//
//        }

        return null;
    }

//    public boolean isValidBST(Node node){
//        return isValidBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
//    }
//
//    private boolean isValidBST(Node node, int minValue, int maxValue) {
//        if(node == null)
//            return true;
//
//        //...node
//        //...node.left;
//        //...node.right
//    }
}
