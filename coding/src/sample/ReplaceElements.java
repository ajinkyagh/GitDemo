package sample;

public class ReplaceElements {
    public static void replaceElements(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args){
        int[] arr={17,18,5,4,6,1};
        replaceElements(arr);
    }
}
