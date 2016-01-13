package iCoding;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/ (24. Swap Nodes in Pairs)
 * @author carrieli
 *
 */

/*
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
	
	ListNode(){
	}
}
*/

public class SwapPairs {
	public static void main(String[] args){
		ListNode l = new ListNode(1);
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(8);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(11);
		l.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		l = swapPairs(l);
		ListNode p = l;
		while(p != null){
			System.out.println(p.val);
			p = p.next;
		}
	}
	
	public static ListNode swapPairs(ListNode head){
		if(head==null || head.next==null)
			return head;
		
		ListNode p,q;
		
		/* 交换链表的前两个结点 */
		q = head.next;
		head.next = q.next;
		q.next = head;
		head = q;
		
		/* 交换之后的结点 */
		p = head.next;
		while(p.next!=null && p.next.next!=null){
			q = p.next.next;
			p.next.next = q.next;
			q.next = p.next;
			p.next = q;
			
			p = q.next;
		}
		return head;
	}
}

