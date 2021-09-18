package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxLength718 {
    public static void main(String[] args){
        int[] nums1={0,0,0,0,1};
        int[] nums2={1,0,0,0,0};
        System.out.println(findLength(nums1,nums2));
    }
    public static int findLength(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        int count=0;
        for (int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
            list2.add(nums2[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        list1 = list1.stream().distinct().collect(Collectors.toList());
        //list2 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
        for (int i=0;i<list1.size();i++){
            for (int j=0;j<list2.size();j++){
                if (list1.get(i)==list2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
