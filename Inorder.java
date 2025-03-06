import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
    this.value=value;
    left=right=null;
    }
}


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeNode root = null;
    
    // System.out.println("Enter the number of nodes");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        int val= sc.nextInt();
        root=insert(root,val);
    }
    
    inorder(root);
    
    }
    public static TreeNode insert(TreeNode root,int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.value > val ){
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
        }
    }
}
