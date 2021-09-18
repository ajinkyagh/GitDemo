package sample;

import java.util.*;

public class GroupPeople {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
       List<List<Integer>> list=new ArrayList<>();
       Map<Integer,List<Integer>> map=new HashMap<>();
       for (int i=0;i<groupSizes.length;i++){
           int current=groupSizes[i];
           List<Integer> temp=new ArrayList<>();
           if (map.containsKey(current)){
               temp=map.get(current);
           }
           temp.add(i);
           map.put(current,temp);
           if(temp.size()==current){
               list.add(temp);
               map.remove(current);

           }
       }
       return list;
    }
    public static void main(String[] args){
        int[] people={3,3,3,3,3,1,3};
        System.out.println(groupThePeople(people));
    }
}


