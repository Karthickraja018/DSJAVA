import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
    this.value=value;
    left=right=null;
    }
}


public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeNode root = null;
    
    // System.out.println("Enter the number of nodes");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        int val= sc.nextInt();
        root=insert(root,val);
    }
    System.out.println("preorder");
    preorder(root);
    System.out.println("inorder");
    inorder(root);
    System.out.println("postorder");
    postorder(root);
    
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
    public static void preorder(TreeNode root){
        if(root!=null){
            System.out.print(root.value+" ");
            preorder(root.left);
            preorder(root.right);
           
        }
    }
    public static void inorder(TreeNode root){
        if(root!=null){
            
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
            
        }
    }
    public static void postorder(TreeNode root){
        if(root!=null){
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value+" ");
        }
        
    }
}
