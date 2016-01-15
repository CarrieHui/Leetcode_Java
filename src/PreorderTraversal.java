package iCoding;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/ (144. Binary Tree Preorder Traversal)
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
public class PreorderTraversal {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		root.right = a;
		a.left = b;
		
		List<Integer> list = new ArrayList<Integer>();
		list = preorderTraversal(root);
		for(int e : list)
			System.out.println(e + " ");
	}
	
    public static List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	traversal(root, list);
    	return list;
    }
    
    public static void traversal(TreeNode node, List<Integer> list){
    	if(node != null){
    		list.add(node.val);
    		traversal(node.left, list);
    		traversal(node.right, list);
    	}
    }
}
