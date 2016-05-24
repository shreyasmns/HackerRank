/*
    	 3
       /   \
      5     2
     / \    /
    1   4  6

For the above tree, the level order traversal is 3 -> 5 -> 2 -> 1 -> 4 -> 6.

*/

package trees;

public class LevelOrderTraversal {

	public static void main(String[] args) {

	}

	class Node {
		int data;
	    Node left;
	    Node right;
	}
    
void LevelOrder(Node root)
 {
    java.util.LinkedList<Node> q = new java.util.LinkedList<Node>();
    
    if(root!=null){
        q.add(root);
    }
    
    while(q.peekFirst()!= null){
        Node current = q.pollFirst();
        System.out.print(current.data+" ");
        
        if(current.left!=null){
            q.add(current.left);
        }
        if(current.right!=null){
            q.add(current.right);
        }
     }
   }
}
