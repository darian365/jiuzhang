package suanfa.rumen;

public class FindNode {

    public static ListNode findNode(ListNode head, int val) {

        while(head != null) {
            if(head.val == val) {
                return head;
            }
            head = head.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        ListNode node1 = new ListNode(4);
//        ListNode node2 = new ListNode(6);
//        ListNode node3 = new ListNode(8);
//        
//        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
        
        System.out.println(findNode(head, 1).val);
    }

}
