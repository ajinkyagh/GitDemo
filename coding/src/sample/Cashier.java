package sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cashier {

    public int N,dis;
    public int[] pro,pri;
    int count=1;
    public  Map<Integer,Integer> map=new HashMap<>();
    public Cashier(int n, int discount, int[] products, int[] prices) {
        N=n;
        dis=discount;
        for (int i=0;i<products.length;i++){
            map.put(products[i],prices[i]);
        }
        //pro= Arrays.stream(products).toArray();
        //pri= Arrays.stream(prices).toArray();
    }

    public double getBill(int[] product, int[] amount) {
        double price = 0;
        if (N==count){
            for (int i=0;i<product.length;i++){
                price+=map.get(product[i])*amount[i];

            }
            price=price-(price*dis)/100;
            count=1;

        }
        else {
            for (int i=0;i<product.length;i++){
             price+=map.get(product[i])*amount[i];
            }
            count++;
        }


        return price;
    }
    public static void main(String[] args){
        int[] products={1,2,3,4,5,6,7};
        int[] prices={100,200,300,400,300,200,100};
        Cashier cashier=new Cashier(3,50,products,prices);
        System.out.println(cashier.getBill(new int[]{1, 2}, new int[]{1, 2}));
        System.out.println(cashier.getBill(new int[]{3, 7}, new int[]{10, 10}));
        System.out.println(cashier.getBill(new int[]{1,2,3,4,5,6,7}, new int[]{1,1,1,1,1,1,1}));
        System.out.println(cashier.getBill(new int[]{4}, new int[]{10}));
        System.out.println(cashier.getBill(new int[]{7,3}, new int[]{10, 10}));
        System.out.println(cashier.getBill(new int[]{7,5,3,1,6,4,2}, new int[]{10,10,10,9,9,9,7}));
        System.out.println(cashier.getBill(new int[]{2,3,5}, new int[]{5,3,2}));



    }
}
