package trees;

public class HeightofaBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node {
		int data;
		Node left;
		Node right;
	}
	
    int height1 = 1;
    int height2 = 1;
    int height = 0;

    int height(Node root)
    {
    	if(root == null) return 0;
    
    	return Math.max(height(root.left)+1, height(root.right)+1);
    }
}
