package sample;

import java.util.ArrayList;
import java.util.Collections;

public class SumUnique {
    public static void sumOfUnique(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
       for (int i=0;i<nums.length;i++){
           for (int j=0;j<nums.length;j++){
               if (i==j && i== nums.length-1 && j==nums.length-1){
                   list.add(nums[i]);
               }
               if(i==j){
                   continue;
               }
               else {
                   if (nums[i]==nums[j]){
                       break;
                   }
                   else if (j== nums.length-1){
                       list.add(nums[i]);
                   }
                   else{
                       continue;
                   }
               }
           }
       }

        System.out.println(list);
        System.out.println(list.stream().mapToInt(i -> i).sum());


    }


    public static void main(String[] args){
        int[] nums={1,2,3,2};
        sumOfUnique(nums);
    }
}
