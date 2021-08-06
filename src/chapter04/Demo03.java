package chapter04;

public class Demo03 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode left, TreeNode right){
        //如果左右子节点都为空，说明当前节点是叶子节点，返回true
        if (left==null && right==null)
            return true;

        if (left==null || right==null || left.val!=right.val)
            return false;
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }

}
