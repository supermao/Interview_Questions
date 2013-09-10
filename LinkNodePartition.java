
public class LinkNodePartition {

	public static ListNode partition(ListNode node, int x){
		ListNode before = null;
		ListNode after = null;
		while(node != null){
			ListNode new_one = new ListNode(node.val);
			if(node.val < x){
				new_one.next = before;
				before = new_one;
			}
			else{
				new_one.next = after;
				after = new_one;
			}
			node = node.next;
		}

		if(before == null){
			return after;
		}else{
			ListNode end_of_before = before;
			while(end_of_before.next != null){
				end_of_before = end_of_before.next;
			}
			end_of_before.next=after;
		}
		return before;
	}
	
	public static ListNode partition2 (ListNode node, int x){
		ListNode before = null;
		ListNode after = null;
		while(node != null){
			ListNode next = node.next;
			if(node.val < x){
				node.next = before;
				before = node;
			}else{
				node.next = after;
				after = node;
			}
			node = next;
		}
		
		if (before == null){
			return after;
		}
		
		ListNode head = before;
		while (head.next != null){
			head = head.next;
		}
		head.next = after;
		
		return before;
		
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		
		ListNode answer = partition2(l1,4);
		while(answer != null){
			System.out.println(answer.val);
			answer = answer.next;
		}
	}

}
