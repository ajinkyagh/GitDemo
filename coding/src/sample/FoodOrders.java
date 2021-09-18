package sample;

import java.util.*;

import static java.util.Arrays.asList;

public class FoodOrders {
    public static List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<String, List<String>> map=new HashMap<>();
        List<String> columnName=new ArrayList<>();
        List<String> tableno=new ArrayList<>();
        List<List<String>>finalList=new ArrayList<>();
       for ( int i=0;i<orders.size();i++){
           if (!columnName.contains(orders.get(i).get(2))) {
               columnName.add(orders.get(i).get(2));
           }

       }
        Collections.sort(columnName);
        columnName.add(0,"Table");
       finalList.add(columnName);


        for ( int i=0;i<orders.size();i++){
             if (map.containsKey(orders.get(i).get(1))){
              List<String> st1=map.get(orders.get(i).get(1));
              st1.add(orders.get(i).get(2));
              Collections.sort(st1);
              map.put(orders.get(i).get(1),st1);
          }
          else {
              List<String>st=new ArrayList<>();
              st.add(orders.get(i).get(2));
              Collections.sort(st);
              map.put(orders.get(i).get(1),st);
          }
        }


        int count =0;
        Object[] arr;

        arr = map.keySet().toArray();
        int[] arr1=new int[arr.length]  ;
        Object[] arr2=new String[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr1[i]= Integer.parseInt(String.valueOf(arr[i])) ;
        }
        Arrays.sort(arr1);

        for (int i=0;i<arr1.length;i++){
            arr2[i]= String.valueOf(arr1[i]);
        }

        for (int j=0;j<arr2.length;j++ ){
            List<String> columnValue=new ArrayList<>();
            for (int i = 1; i < columnName.size(); i++) {
                if (columnValue.isEmpty())
                    columnValue.add((String) arr2[j]);
                count=0;
                for (String s :map.get(arr2[j]) ) {
                        if (columnName.get(i).equals(s) && columnValue.get(0).equals(arr2[j])) {
                            count++;
                        }
                    }
                columnValue.add(String.valueOf(count));
                }
                finalList.add(columnValue);

            }
       return finalList;


        }



    public static void main(String[] args){
        List<List<String>> list = asList(
                asList("David","3","Ceviche"),
                asList("Corina","10","Beef Burrito"),
                asList("David","3","Fried Chicken"),
                asList("Carla","5","Water"),
                asList("Carla","5","Ceviche"),asList("Rous","3","Ceviche"));
        System.out.println(displayTable(list));


    }
}
/*[["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
        [["James","12","Fried Chicken"],["Ratesh","12","Fried Chicken"],["Amadeus","12","Fried Chicken"],["Adam","1","Canadian Waffles"],["Brianna","1","Canadian Waffles"]]
        [["Laura","2","Bean Burrito"],["Jhon","2","Beef Burrito"],["Melissa","2","Soda"]]*/
