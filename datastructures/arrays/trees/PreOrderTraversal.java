package trees;

public class PreOrderTraversal {

	public static void main(String[] args) {

	}
	
	class Node {
	    int data;
	    Node left;
	    Node right;
	}


	void Preorder(Node root) {
	    System.out.print(root.data+" ");
	    
	    if(root.left != null){
	        Preorder(root.left);
	    }
	    
	    if(root.right != null){
	        Preorder(root.right);
	    }

	}


}
