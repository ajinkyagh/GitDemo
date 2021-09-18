package sample;

public class CustomStack {
    public int[] arr;
    public int i=0,topI;

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }

    public void push(int x) {
        if (i != arr.length) {
            arr[i]=x;
            topI=i;
            i++;
        }


    }
    public void disp(){
        for (int j = 0; j <arr.length; j++){
            System.out.println(arr[j]);
        }
    }

    public int pop() {
        if (i==0){
            return -1;
        }
        else {
            int value=arr[topI];
            arr[topI]=-1;
            topI--;
            i--;
            return value;
        }


    }

    public void increment(int k, int val) {
        if(k>arr.length){
            for (int i=0;i<arr.length;i++){
                if(arr[i]!=-1)
                    arr[i]+=val;
            }
        }
        else {
            for (int i=0;i<k;i++){
                if(arr[i]!=-1)
                    arr[i]+=val;
            }

        }

    }
    public static void main(String[] args){
        CustomStack obj=new CustomStack(3);
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.increment(5,100);
        obj.increment(2,100);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());


        obj.disp();

    }
}
