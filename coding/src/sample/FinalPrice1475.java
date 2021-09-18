package sample;

public class FinalPrice1475 {
    public static void finalPrices(int[] prices) {
        int[] arr1=new int[prices.length];
        int k=0;
        for (int i=0;i<prices.length-1;i++){
            for (int j=i+1;j<prices.length;j++){
                if(j>i && prices[j]<=prices[i]){
                    arr1[k]=prices[i]-prices[j];
                    k++;
                    break;
                }
                 if(prices[j]>prices[i] && j==arr1.length-1){
                    arr1[k]=prices[i];
                    k++;
                }
                 /*else if(j==arr1.length-1){
                     arr1[k]=prices[j];
                 }*/
            }
        }
        arr1[arr1.length-1]=prices[arr1.length-1];
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static void main(String[] args){
        int[] arr= {8,7,4,2,8,1,7,7,10,1};
        finalPrices(arr);
    }
}
