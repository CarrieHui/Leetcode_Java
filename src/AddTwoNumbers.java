package iCoding;

/**
 * https://leetcode.com/problems/add-two-numbers/ (2. Add Two Numbers)
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

public class AddTwoNumbers {
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		ListNode l1_1 = new ListNode(4);
		ListNode l1_2 = new ListNode(3);
		l1.next = l1_1;
		l1_1.next = l1_2;
		
		ListNode l2 = new ListNode(5);
		ListNode l2_1 = new ListNode(6);
		ListNode l2_2 = new ListNode(4);
		l2.next = l2_1;
		l2_1.next = l2_2;
		
		ListNode l3 = addTwoNumbers(l1, l2);
		ListNode p = l3;
		while(p != null){
			System.out.println(p.val);
			p = p.next;
		}	
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;   //进位位
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode result = new ListNode(0);
		ListNode p3 = result;
		while(p1!=null && p2!=null){
			p3.val = (p1.val + p2.val + carry) % 10;
			carry = (p1.val + p2.val + carry) / 10;
			p1 = p1.next;
			p2 = p2.next;
			if(carry!=0 || p1!=null || p2!=null){
				p3.next = new ListNode(0);
				p3 = p3.next;
			}
		}
		if(p1==null && p2==null && carry!=0){
			p3.val = carry;
		}else if(p1==null && p2!=null){
			while(p2 != null){
				p3.val = (p2.val + carry) % 10;
				carry = (p2.val + carry) / 10;
				p2 = p2.next;
				if(carry!=0 || p2!=null){
					p3.next = new ListNode(0);
					p3 = p3.next;
				}
			}
			if(carry != 0){
				p3.val = carry;
			}
		}else{
			while(p1 != null){
				p3.val = (p1.val + carry) % 10;
				carry = (p1.val + carry) / 10;
				p1 = p1.next;
				if(carry!=0 || p1!=null){
					p3.next = new ListNode(0);
					p3 = p3.next;
				}
			}
			if(carry != 0){
				p3.val = carry;
			}
		}
		return result;
    }
}
