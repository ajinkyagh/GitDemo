package sample;

public class BinaryToInteger {

    public static void getDecimalValue(ListNode head) {
        String data="";
        while(head.next!=null){
            data+=String.valueOf(head.val);
            head=head.next;
        }
        data+=String.valueOf(head.val);
        int decimal=Integer.parseInt(data,2);
        System.out.println(decimal);







    }
    public static void main(String[] args){
        ListNode node=new ListNode(0);
        ListNode node1=new ListNode(0,node);
        ListNode node2=new ListNode(0,node1);
        ListNode node3=new ListNode(0,node2);
        ListNode node4=new ListNode(0,node3);
        ListNode node5=new ListNode(0,node4);
        ListNode node6=new ListNode(1,node5);
        ListNode node7=new ListNode(1,node6);
        ListNode node8=new ListNode(1,node7);
        ListNode node9=new ListNode(0,node8);
        ListNode node10=new ListNode(0,node9);
        ListNode node11=new ListNode(1,node10);
        ListNode node12=new ListNode(0,node11);
        ListNode node13=new ListNode(0,node12);
        ListNode head=new ListNode(1,node13);
        getDecimalValue(head);

    }
}
