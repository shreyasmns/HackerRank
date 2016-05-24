package trees;

public class InOrderTraversal {

	public static void main(String[] args) {

	}
	
	class Node {
	    int data;
	    Node left;
	    Node right;
	}

	void Inorder(Node root) {
	    
	    if(root.left != null ){
	        Inorder(root.left);
	    }
	    
	    System.out.print(root.data + " ");
	    
	    if(root.right != null){
	        Inorder(root.right);
	    }
	}
}
