package iCoding;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/ (104. Maximum Depth of Binary Tree)
 * @author carrieli
 *
 */

/*
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val =val;
	}
}
*/

public class MaxDepth {
	
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		d.left = f;
		System.out.println(maxDepth(a));
	}
	
    public static int maxDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	else if(root.left==null && root.right==null)
        	return 1;
    	else
    		return Math.max(maxDepth(root.left), maxDepth(root.right)) +1 ;
    	
    }
}
