package chapter04;

public class Demo02 {
    public boolean isValidBST(TreeNode root){
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, long minVal, long maxVal){
        if (root==null)
            return true;
        //如果节点超过范围，直接返回false
        if (root.val >= maxVal || root.val <=minVal)
            return false;
        //再分别判断左右两个子节点
        //左子树范围的最小值是minVal，最大值是当前节点的值
        //右子树范围的最大值是maxVal，最小值是当前节点的值
        boolean leftResult = isValidBST(root.left, minVal, root.val);
        boolean rightResult = isValidBST(root.right, root.val, maxVal);
        return leftResult && rightResult;

    }
}
