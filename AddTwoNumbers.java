
public class AddTwoNumbers{

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode it1 = l1;
		ListNode it2 = l2;
		int carry = 0;
		ListNode head = null;
		ListNode tail = null;



		while(it1 != null || it2 != null || carry !=0){
			int i1 = it1 == null? 0 : it1.val;
			int i2 = it2 == null? 0 : it2.val;
			int sum = i1 + i2 + carry;
			carry = 0;
			if (sum >= 10){
				carry = 1;
				sum = sum - 10;
			}
			if(head == null){
				head = new ListNode(sum);
				tail = head;
			}else{
				System.out.println(tail.val);
				System.out.println(sum);
				tail.next = new ListNode(sum);
				tail = tail.next;
			}
			it1 = it1 == null? null : it1.next;
			it2 = it2 == null? null : it2.next;

		}
		return head;


	} 



	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
		ListNode l3 = new ListNode(9);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		addTwoNumbers(l5,l5);
		//		l4.next = l5;



		//		System.out.println(listToInt(l5));
	}

}


