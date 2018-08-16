package suanfa.rumen;

public class ListNodeInsert {

	static ListNode insertNode(ListNode head, int val) {
		
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode curr = dummy;
        if(head == null) {
            return new ListNode(val);
        }else {
            while(curr.next != null && curr.next.val < val) {
            	curr = curr.next;
            }
            ListNode node = new ListNode(val);
            node.next = curr.next;
            curr.next = node;
        }
        return dummy.next;
        
        
	    /*
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        
        while (cur.next != null && cur.next.val <= val) {
            cur = cur.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next = newNode;
        return dummy.next;
        */
	}
	
	public static void main(String[] args) {
		ListNode head = null;
//		ListNode node1 = new ListNode(4);
//		ListNode node2 = new ListNode(6);
//		ListNode node3 = new ListNode(8);
//		
//		head.next = node1;
//		node1.next = node2;
//		node2.next = node3;
		
		head = insertNode(head, 1);
		head = insertNode(head, 0);
		
		while(head !=null ) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	
}

class ListNode {
	ListNode next;
	int val;
	
	public ListNode(int val) {
		this.val = val;
	}
}
