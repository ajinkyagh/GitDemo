package sample;

import java.util.Scanner;

public class Code12 {
    public static void main(String[] args){
        Scanner myInput=new Scanner(System.in);
        int rightShift=myInput.nextInt();
        int[]  arrayList={1,2,3,4,5,6};
//        System.out.println(arrayList.length);

        for (int i=0,j=rightShift;j<arrayList.length;j++){

           arrayList[i]= arrayList[i]+arrayList[j];
           arrayList[j]= arrayList[i]-arrayList[j];
            arrayList[i]= arrayList[i]-arrayList[j];
            i++;
        }
       /* for (int i=arrayList.length-2,j=arrayList.length-1;j<arrayList.length;j++){
            arrayList[i]= arrayList[i]+arrayList[j];
            arrayList[j]= arrayList[i]-arrayList[j];
            arrayList[i]= arrayList[i]-arrayList[j];
            i++;
        }*/

        for (int i=0;i< arrayList.length;i++) {
            System.out.println(arrayList[i]);
        }


    }
}
