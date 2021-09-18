package sample;

public class AddNos {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;
    public Node  head1=null;
    public Node  tail1=null;
    public int number=0;
    public int number1;

    public void addNode1(int data){
        Node newNode= new Node(data);
        if(head1==null){
            head1=newNode;
            tail1=newNode;
        }
        else {
            tail1.next=newNode;
            tail1=newNode;
        }
    }

    public void addNode(int data){
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void  deleteFromEnd(){
        if(head==null){

        }
        else {
            if (head!=tail){
                Node current=head;
                while (current.next!=tail){
                    current=current.next;
                }
                number=number*10+current.next.data;
                tail=current;
                tail.next=null;

            }
            else {
                number=number*10+tail.data;
                head=tail=null;

            }
        }
    }
    public void deleteFromEnd1(){
        if (head1==null){
            System.out.println("List is Empty");
        }
        else {
            if(head1!=tail1){
                Node current=head1;
                while(current.next!=tail1){
                    current=current.next;
                }
                number1=number1*10+current.next.data;
                tail1=current;
                tail1.next=null;

            }
            else {
                number1=number1*10+tail1.data;
                head1=tail1=null;

            }
        }
    }
    public void addNos(){
        int no=number+number1;
        int x=0;
        while (no!=0){
            x=x*10+no%10;
            no=no/10;
        }
        System.out.println(x);
    }
    public void display1(){
        Node current=head1;

        if (head1==null){
            System.out.print("List is empty");
        }
        else {
            while (current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public void display(){
        Node current=head;

        if (head==null){
            System.out.print("List is empty");
        }
        else {
            while (current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public static void main(String[] args){
        AddNos slist=new AddNos();
        slist.addNode(2);
        slist.addNode(4);
        slist.addNode(3);
        slist.addNode1(5);
        slist.addNode1(6);
        slist.addNode1(4);

        /*slist.addNode(9);
        slist.addNode(9);
        slist.addNode(9);
        slist.addNode(9);
        slist.addNode(9);
        slist.addNode(9);
        slist.addNode(9);
        slist.addNode1(9);
        slist.addNode1(9);
        slist.addNode1(9);
        slist.addNode1(9);*/

       /* slist.addNode(0);
        slist.addNode1(0);*/

        while(slist.head != null) {
            slist.deleteFromEnd();

        }
        while(slist.head1 != null) {
            slist.deleteFromEnd1();

        }
        slist.addNos();

    }
}
