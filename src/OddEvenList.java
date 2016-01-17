package iCoding;

/**
 * https://leetcode.com/problems/odd-even-linked-list/ (328. Odd Even Linked List)
 * @author carrieli
 *
 */

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class OddEvenList {
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(5);
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		
		oddEvenList(head);
		
		ListNode p;
		p = head;
		while(p != null){
			System.out.println(p.val);
			p = p.next;
		}
	}
	
    public static ListNode oddEvenList(ListNode head) {
        if(head==null){
        }
        else{
        	ListNode head1 = head.next;
        	ListNode p = head;
        	ListNode q = head.next;
        	while(p!=null && q!=null){
        		if(q.next==null)
        			break;
        		p.next = q.next;
        		p = q.next;
        		if(p==null)
        			break;
        		q.next = p.next;
        		q = p.next;
        	}
        	p.next = head1;
        }
    	
    	return head;
    }
}
