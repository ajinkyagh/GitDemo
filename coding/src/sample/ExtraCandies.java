package sample;

import java.util.*;

public class ExtraCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<Boolean>();
        int max =  Arrays.stream(candies).max().getAsInt();
        int sum=0;
        for (int i=0;i<candies.length;i++){
            sum=candies[i]+extraCandies;
            if(sum>=max){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;



    }
    public static void main(String[] args){
        int[] candies={12,1,12};
        int extraCandies=10;


        System.out.println(kidsWithCandies(candies,extraCandies));

    }
}
/*Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]

        Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]*/

