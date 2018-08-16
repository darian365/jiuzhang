package suanfa.rumen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindMidNode {

    public static ListNode findMiddleNode(ListNode head) {

        if(head == null) {
            return head;
        }
        
        List<ListNode> nodelist = new ArrayList<>();
        while(head != null) {
            nodelist.add(head);
            head = head.next;
        }
        
        return nodelist.get((nodelist.size()-1)/2);
    }
    
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(10);
        ListNode node5 = new ListNode(12);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node4.next = node5;
        
        System.out.println(findMiddleNode(head).val);
    }

}
