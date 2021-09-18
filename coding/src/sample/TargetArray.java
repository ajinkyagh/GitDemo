package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TargetArray {
    public static void main(String[] args){
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        createTargetArray(nums,index);

    }
    public static void createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println(arr);










    }
}
