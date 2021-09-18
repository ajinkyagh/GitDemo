package sample;

import java.util.*;

class SeatManager {
       PriorityQueue<Integer> queue=new PriorityQueue<Integer>();

    public static void main(String[] args){
        SeatManager obj=new SeatManager(5);
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        obj.unreserve(2);
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        obj.unreserve(5);
    }
    public SeatManager(int n) {
        for (int i=0;i<n;i++){
            queue.add(i+1);
        }
        //System.out.println(list);
    }
    public int reserve() {
        int var= queue.peek(); ;
        queue.remove(var);
       return var;
    }

    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }

}
