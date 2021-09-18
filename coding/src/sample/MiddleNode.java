package sample;

public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        int count=1,count1=0,half;
        ListNode trav=head,trav1;
        while(trav.next!=null){
            count++;
            trav=trav.next;
        }
        half=(count/2);
        int[] arr=new int[count];
        trav=head;
        for (int i=0;i<arr.length;i++){
            arr[i]=trav.val;
            trav=trav.next;
        }
        trav1=head;
        while( count1!=half ){
            count1++;
            trav1=trav1.next;
        }
        System.out.println(trav1.val);


        return trav1;
    }
    public static void main(String[] args){
        ListNode node0=new ListNode(6);
        ListNode node=new ListNode(5,node0);
        ListNode node1=new ListNode(4,node);
        ListNode node2=new ListNode(3,node1);
        ListNode node3=new ListNode(2,node2);
        ListNode head=new ListNode(1,node3);
        System.out.println(middleNode(head));
    }
}
