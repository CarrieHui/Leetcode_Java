package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/invert-binary-tree/ (226. Invert Binary Tree)
 * @author carrieli
 *
 */


/*
 public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		val = x;
		left = null;
		right = null;
	}
}
 */

public class InvertTree {
	public static void main(String[] args){
		TreeNode head = new TreeNode(7);
		TreeNode l1_1 = new TreeNode(3);
		TreeNode l1_2 = new TreeNode(9);
		head.left = l1_1;
		head.right = l1_2;
		
		TreeNode l2_1 = new TreeNode(2);
		TreeNode l2_2 = new TreeNode(5);
		TreeNode l2_3 = new TreeNode(8);
		TreeNode l2_4 = new TreeNode(10);
		l1_1.left = l2_1;
		l1_1.right = l2_2;
		l1_2.left = l2_3;
		l1_2.right = l2_4;
		
		TreeNode l3_1 = new TreeNode(1);
		TreeNode l3_2 = new TreeNode(4);
		TreeNode l3_3 = new TreeNode(6);
		TreeNode l3_4 = new TreeNode(11);
		l2_1.left = l3_1;
		l2_2.left = l3_2;
		l2_2.right = l3_3;
		l2_4.right = l3_4;

		head = invertTree(head); 
		
		Deque<TreeNode> q3 = new ArrayDeque<TreeNode>();
		q3.addLast(head);
		while(q3.peekFirst() != null){
			TreeNode node = q3.removeFirst();
			System.out.print(node.val);
			System.out.print(' ');
			if(node.left != null){
				System.out.print(node.left.val);
				System.out.print(' ');
				q3.addLast(node.left);
			}
			if(node.right != null){
				System.out.print(node.right.val);
				System.out.print(' ');
				q3.addLast(node.right);
			}
			System.out.println();
		}
	}
	
	public static TreeNode invertTree(TreeNode root) {
        TreeNode temp, newRoot=root;
        if(root != null){
            if(root.left == null){
                if(root.right != null){
                    root.left = root.right;
                    root.right = null;
                    invertTree(root.left);
                }
            }else{
                if(root.right == null){
                    root.right = root.left;
                    root.left = null;
                    invertTree(root.right);
                }else{
                    temp = root.left;
                    root.left = root.right;
                    root.right = temp;
                    invertTree(root.left);
                    invertTree(root.right);
                }
            }
        }
        return newRoot;
    }
}
