package iCoding;

/**
 * https://leetcode.com/problems/reverse-linked-list/ (206. Reverse Linked List)
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

public class ReverseList {
	public static void main(String[] args) {
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
		
		ListNode list = reverseList(l);
		ListNode p = list;
		while(p != null){
			System.out.print(p.val + " ");
			p = p.next;
		}	
	}
	
	public static ListNode reverseList(ListNode head){
		if(head == null)
			return head;
		else if(head.next == null)
			return head;
		else{
			ListNode p,q,t;
			p = head;
			q = head.next;
			do{
				t = q.next;
				q.next = p;
				if(p == head)
					p.next = null;
				p = q;
				q = t;
			}
			while(t != null);
			return p;
		}
	}
}
