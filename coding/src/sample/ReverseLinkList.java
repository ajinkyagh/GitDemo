package sample;

import java.util.Stack;

public class ReverseLinkList {
    public static void reverseList(ListNode head) {
        Stack<Integer>st=new Stack<>();
        ListNode trav = head;

        while(head.next!=null){
            st.push(head.val);
            head=head.next;
        }
        st.push(head.val);
        while (!st.empty()){
            trav.val=st.pop();
            trav=trav.next;
        }


    }

    public static void main(String[] args){
        ListNode node=new ListNode(5);
        ListNode node1=new ListNode(4,node);
        ListNode node2=new ListNode(3,node1);
        ListNode node3=new ListNode(2,node2);
        ListNode head=new ListNode(1,node3);
        reverseList(head);

    }
}
