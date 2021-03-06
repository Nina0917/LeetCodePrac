package chapter04;

public class Demo05 {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length==0)
            return null;
        return sortedArrayToBST(num,0,num.length-1);
    }
    public TreeNode sortedArrayToBST(int[] num, int start, int end){
        if (start>end)
            return null;
        int mid= (start+end) >>1;
        TreeNode root=new TreeNode(num[mid]);
        root.left=sortedArrayToBST(num,start,mid-1);
        root.right=sortedArrayToBST(num,mid+1,end);
        return root;
    }
}
