package models;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public static TreeNode insert(TreeNode node, int value){
        if(node == null)
            return new TreeNode(value);

        if(value < node.val)
            node.left = insert(node.left, value);
        else if(value > node.val)
            node.right = insert(node.right, value);

        return node;
    }


    public static boolean isValidBST(TreeNode node){
        return isValidBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode node, int minValue, int maxValue) {
        if(node == null)
            return true;
        else if(minValue > node.val || maxValue < node.val)
            return false;
        else {
            return (isValidBST(node.left, minValue, node.val) && isValidBST(node.right, node.val, maxValue));
        }

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
//        treeNode.left = new TreeNode(2);
//        treeNode.left.left = new TreeNode(1);
//        treeNode.left.right = new TreeNode(10);
//        treeNode.right = new TreeNode(8);

        TreeNode.insert(treeNode, 2);
        TreeNode.insert(treeNode, 1);
        TreeNode.insert(treeNode, 10);
        TreeNode.insert(treeNode, 8);
        TreeNode.insert(treeNode, 7);
        TreeNode.insert(treeNode, 9);

        System.out.println(TreeNode.isValidBST(treeNode));
    }
}
