package iCoding;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/ (94. Binary Tree Inorder Traversal)
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

public class InorderTraversal {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		root.right = a;
		a.left = b;
		
		List<Integer> list = new ArrayList<Integer>();
		list = inorderTraversal(root);
		for(int e : list)
			System.out.println(e + " ");
	}
	
    public static List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	traversal(root, list);
    	return list;
    }
    
    public static void traversal(TreeNode node, List<Integer> list){
    	if(node != null){
    		traversal(node.left, list);
    		list.add(node.val);
    		traversal(node.right, list);
    	}
    }
}
