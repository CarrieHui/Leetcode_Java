package iCoding;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/ (21. Merge Two Sorted Lists)
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

public class Merge2SortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l1_1 = new ListNode(3);
		ListNode l1_2 = new ListNode(5);
		ListNode l1_3 = new ListNode(8);
		l1.next = l1_1;
		l1_1.next = l1_2;
		l1_2.next = l1_3;
		
		ListNode l2 = new ListNode(2);
		ListNode l2_1 = new ListNode(4);
		ListNode l2_2 =new ListNode(5);
		ListNode l2_3 = new ListNode(9);
		ListNode l2_4 = new ListNode(11);
		l2.next = l2_1;
		l2_1.next = l2_2;
		l2_2.next = l2_3;
		l2_3.next = l2_4;
		
		ListNode l3 = mergeTwoLists(l1, l2);
		ListNode p = l3;
		while(p != null){
			System.out.print(p.val + " ");
			p = p.next;
		}	
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode p=l1, q=l2, k=l1, head=l1, node;
		int flag = 0;
		while(p!=null && q!=null){
			if(p.val < q.val){
				node = p;
				p = p.next;
			}
			else{
				node = q;
				q = q.next;
			}
			node.next = null;
			
			if(flag == 0){
				head = node;
				k = node;
				flag = 1;
			}
			else{
				k.next = node;
				k = k.next;
			}
		}
		if(p != null){
			if(flag ==0)
				head = p;
			else
				k.next = p;
		}
		if(q != null){
			if(flag ==0)
				head = q;
			else
				k.next = q;
		}
		return head;
	}
}

