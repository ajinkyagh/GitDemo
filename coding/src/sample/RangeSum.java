package sample;

public class RangeSum {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        TreeNode travL=root;
        TreeNode travR=root;
        if (travL.val>=low && travL.val<=high){
            sum+=travL.val;
        }
        return sum;
    }
    public static void main(String[] args){
        TreeNode tree=new TreeNode(18,null,null);
        TreeNode tree7=new TreeNode(13,null,null);
        TreeNode tree6=new TreeNode(6,null);
        TreeNode tree5=new TreeNode(1,null);
        TreeNode tree1=new TreeNode(7,tree6,null);
        TreeNode tree2=new TreeNode(3,tree5,null);
        TreeNode tree3=new TreeNode(15,tree7,tree);
        TreeNode tree4=new TreeNode(5,tree2,tree1);
        TreeNode root=new TreeNode(10,tree4,tree3);
        System.out.println(rangeSumBST(root,6,10));


    }
}
