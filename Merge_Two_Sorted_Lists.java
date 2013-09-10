
public class Merge_Two_Sorted_Lists {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public static ListNode  mergeTwoLists(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode head = null;
		if(l1 != null || l2 !=null){
			if (l1 == null){
				head = l2;
				l2 = l2.next;
			} 
			else if (l2 == null){
				head = l1;
				l1 = l1.next;
			} 
			else{
				if (l1.val < l2.val){
					head = l1;
					l1 = l1.next;
				}else{
					head = l2;
					l2 = l2.next;
				}
			}
		}

		ListNode pointer = head;


		while(l1 != null || l2 != null){
			if(l1 != null && l2!= null){
				if(l1.val < l2.val){
					ListNode current = new ListNode(l1.val);
					pointer.next = current;
                    pointer = pointer.next;
					l1 = l1.next;
				}else{
					ListNode current = new ListNode(l2.val);
					pointer.next = current;
                    pointer = pointer.next;
					l2 = l2.next;
				}
			}

			if(l1 == null){
				pointer.next = l2;
				break;
			}

			if(l2 == null){
				pointer.next = l1;
				break;
			}

		}
		return head;

	}

	public static void main(String[] args){
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(4);
		l2.next = l3;
		l3.next = l4;

		ListNode output = mergeTwoLists(l1,l2);
		System.out.println(output.val);
	}
}


