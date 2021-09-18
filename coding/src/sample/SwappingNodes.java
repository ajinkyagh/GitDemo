package sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwappingNodes {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode trav=head;
        int count=1;
        int first,last,temp;
        while (trav.next!=null){
            count++;
            trav=trav.next;
        }
        trav=head;
       int[] arr=new int[count];
       for (int i=0;i<arr.length;i++){
           arr[i]=trav.val;
           trav=trav.next;
       }
       first=k-1;
       last=count-k;
       temp=arr[first];
       arr[first]=arr[last];
       arr[last]=temp;
       trav=head;
       for (int i=0;i<arr.length;i++){
           trav.val=arr[i];
           trav=trav.next;
       }
       return head;
    }
    public static void main(String[] args){
        ListNode node=new ListNode(5);
        ListNode node1=new ListNode(4,node);
        ListNode node2=new ListNode(3,node1);
        ListNode node3=new ListNode(2,node2);
        ListNode head=new ListNode(1,node3);
        while (head!=null)
            System.out.println(swapNodes(head,2));
    }
}
