package iCoding;

/**
 * https://leetcode.com/problems/balanced-binary-tree/ (110. Balanced Binary Tree)
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

public class IsBalanced {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(4);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(6);
		root.left = a;
		root.right = b;
		a.left = c;
		b.right = d;
		c.left = e;
		
		System.out.println(isBalanced(root));
	}
	
	/* 
	 * 方法一 O(N^2)
	public static boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.left)-height(root.right)) <= 1;
	
    }
	public static int  height(TreeNode node){
		if(node == null)
			return 0;
		else
			return Math.max(height(node.left), height(node.right))+1;
	}
	*/
	
	
	/*
	 * 方法二 O(N^2)
	 * 如果当前结点为根的子树平衡，返回高度；如果不平衡，返回－1
	*/
	public static boolean isBalanced(TreeNode root){
		return dfsHeight(root) != -1;
	}
	public static int dfsHeight(TreeNode node){
		if(node == null)
			return 0;
		int left = dfsHeight(node.left);
		int right = dfsHeight(node.right);
		if(left == -1 || right == -1)
			return -1;
		if(Math.abs(left-right) > 1)
			return -1;
		else
			return Math.max(left, right) +1 ;
	}
	
}
