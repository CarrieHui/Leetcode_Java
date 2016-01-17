package iCoding;

/**
 * https://leetcode.com/problems/same-tree/ (100. Same Tree)
 * @author carrieli
 *
 */

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class IsSameTree {
	public static void main(String[] args){
		TreeNode root1 = new TreeNode(1);
		TreeNode a1 = new TreeNode(2);
		TreeNode b1 = new TreeNode(3);
		root1.right = a1;
		a1.left = b1;
		
		TreeNode root2 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode b2 = new TreeNode(3);
		root2.right = a2;
		a2.left = b2;
		
		System.out.println(isSameTree(root1, root2));
	}
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null && q==null)
    		return true;
    	else if(p==null || q==null)
    		return false;
    	else if(p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
    		return true;
    	else
    		return false;
    }
}
