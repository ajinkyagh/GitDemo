package sample;

public class ArrayofArray {
    public static void main(String[] args){
        int[] input={1,2,3,4};
        int[][][] array = new int[0][][];
        array[0][0][0]=input[0];
        array[0][0][1]=input[1];
        array[0][1][0]=input[2];

       System.out.println(array[0][0][0]);
    }
}
