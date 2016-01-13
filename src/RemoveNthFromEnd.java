package iCoding;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/ (19. Remove Nth Node From End of List)
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

public class RemoveNthFromEnd {
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
		
		ListNode list = removeNthFromEnd(l,3);
		ListNode p = list;
		while(p != null){
			System.out.print(p.val + " ");
			p = p.next;
		}	
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n){
		ListNode p = head, q = head;
		int m = n;
		while(m-- > 0){
			if(q == null){
				System.out.println("倒数第"+ n +"个元素不存在！");
				System.exit(0);
			}
			q = q.next;
		}
		if(q == null){
			head = p.next;
		}
		else{
			while(q.next != null){
				p = p.next;
				q = q.next;
			}
			p.next = p.next.next;
		}
		return head;
	}
}




