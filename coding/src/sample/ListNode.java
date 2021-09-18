package sample;


    public class ListNode{
        public int val = 0;
        public ListNode next = null;

        ListNode() {
            val = 0;
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

