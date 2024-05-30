package DS.BinaryTrees;


public class BST {

    public static class BNode{
        int data;
        BNode left,right;
        BNode(int data){
            this.data = data;
//            this.right = null;
//            this.left = null;
        }
    }

    public static BNode insert(BNode root, int val){
        if(root == null){
            root = new BNode(val);
            return root;
        }
        if(root.data > val){
            //Left subtree
            root.left = insert(root.left,val);
        }
        else {
            //Right subtree
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(BNode root){
        if(root==null){
//                System.out.print("-1 ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static boolean search(BNode root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        BNode root = null;
        for (int j : arr) {
            root = insert(root, j);
        }
        inOrder(root);
        System.out.println();

        System.out.println(search(root,3));
    }
}
