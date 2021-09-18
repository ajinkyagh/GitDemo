package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddLengthArr {

        public static void main(String[] args){
            int[] input={6,9,14,5,3,8,7,12,13,1};
            ArrayList<Integer> integers = new ArrayList<>();


        int sum1=0;
            for (int u=1;u<=input.length;u=u+2){
                for (int l=0;l<input.length;l++){
                    integers.add(input[l]);
                }
                int elementsInRow=u;
                if(elementsInRow>1 && elementsInRow<input.length ){
                    for (int i=0;i<elementsInRow;i++){
                        int [][] arrayOfArray = transformIntoArrayOfArray(integers, elementsInRow);
                        int sum= getSum(integers, elementsInRow, arrayOfArray);
                        sum1+=sum;
                        integers.remove(0);
                        print(arrayOfArray,elementsInRow);
                    }
                }
                else {
                    int [][] arrayOfArray = transformIntoArrayOfArray(integers, elementsInRow);
                    int sum= getSum(integers, elementsInRow, arrayOfArray);
                    sum1+=sum;
                    print(arrayOfArray,elementsInRow);
                }
                integers.clear();

                System.out.println(sum1);
                //System.out.println(integers.size());

            }


        }





    private static int[][] transformIntoArrayOfArray(ArrayList<Integer> input, int elementsInRow) {
        int [][] arrayOfArray=new int[input.size()/elementsInRow][elementsInRow];
        int k=0;
        for (int i=0;i<input.size()/elementsInRow;i++) {
            for (int j = 0; j < elementsInRow; j++) {
                arrayOfArray[i][j] = input.get(k);
                k++;
            }
        }
        return arrayOfArray;
    }

    private static int getSum(ArrayList<Integer> input, int elementsInRow, int[][] arrayOfArray) {
        int sum=0;
        for (int i = 0; i< input.size()/ elementsInRow; i++){
            for (int j = 0; j< elementsInRow; j++){
              sum +=  arrayOfArray[i][j];

            }
        }
        return sum;
    }


    private static void print(int[][] arrayOfArray, int elementsInRow) {
        System.out.print("[");
        for(int i = 0; i<arrayOfArray.length; i++){
            System.out.print("[");
            for(int j = 0; j<elementsInRow; j++) {
                System.out.print(arrayOfArray[i][j] + " ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
