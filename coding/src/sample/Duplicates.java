package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args){
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println( findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }

        }
        for (Integer cnt:map.keySet()){
            int url=map.get(cnt);
            if (url>1){
                list.add(cnt);
            }
        }

        //System.out.println(map);
        return list;
    }
}
