
public class DeleteNode {
	public static boolean deleteNode(ListNode n ){
		if (n == null || n.next == null){
			return false;
		}
		ListNode next = n.next;
		n.val = next.val;
		n.next = n.next.next;
		return true;
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
		
		boolean b = deleteNode(l5);
		ListNode l = l1;
		while(l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}

}
