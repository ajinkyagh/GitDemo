package sample;

public class TreeNode {
    int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int i, TreeNode tree) {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
