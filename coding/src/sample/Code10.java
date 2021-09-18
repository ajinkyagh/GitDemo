package sample;

public class Code10 {
    public static void main(String args[]){
        char[] array1={'a','b','c'};
        char[] array2={'1','2','3'};
        int totalLength=array1.length+array2.length;
        char finalArray[]=new char[totalLength];
        System.out.println(totalLength);
        for (int i=0,j=0;i<totalLength && j<totalLength;i=i+2,j++)
        {

                finalArray[i]=array1[j];
                finalArray[i+1]=array2[j];

        }
        System.out.print("[");
        for (int i=0;i<totalLength;i++)
        {

            System.out.print(finalArray[i]+",");

        }
        System.out.print("]");

    }
}
