/*
     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Top View : 1 -> 5 -> 3 -> 2 -> 7
 
*/

package trees;

public class TopViewOfaTree {

	class Node{
		int data;
		Node left;
		Node right;
	}
	
	void top_view(Node root)
	{
	    if (root != null) {
	      left_view(root);
	      right_view(root.right);
	  }
	}
	void left_view(Node root) {
	      if (root != null){
	      left_view(root.left);
	      System.out.print(root.data + " ");
	      }
	}

	void right_view(Node root) {
	      if (root != null){
	      System.out.print(root.data + " ");
	      right_view(root.right);
	      }
	}

}
