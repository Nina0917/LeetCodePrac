package chapter04;

public class Demo01 {
    public int maxDepth(TreeNode root){
        //root为null时最大深度为0
        if (root==null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth,rightDepth);
    }

}
