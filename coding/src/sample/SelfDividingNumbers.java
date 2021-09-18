package sample;

import java.util.ArrayList;

public class SelfDividingNumbers {
    public static void selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(i<10){
                list.add(i);
            }
            else{
                int var=i,var1=i;
                String s=String.valueOf(i);
                boolean[] arr=new boolean[s.length()];
                int flag=0,temp,j=0;
                while(var!=0){
                    temp=var%10;
                    if(temp!=0){
                        if(var1%temp==0){
                            arr[j]=true;
                            j++;
                        }
                    }
                    else {
                        arr[j]=false;
                        j++;
                    }
                    var=var/10;
                }
                for (int k=0;k<arr.length;k++){
                    if(arr[k]==true){
                        flag+=1;
                    }
                }
                if (flag==arr.length){
                    list.add(i);
                }

            }
        }
        System.out.println(list);

    }

    public static void main(String[] args){
        selfDividingNumbers(66,708);

    }
}
