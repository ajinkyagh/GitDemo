package sample;

public class ProductArray1822 {
    public static void main(String[] args){
        int[] arr={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(arr));
    }
    public static int arraySign(int[] nums) {
        double product=1;
                int result;
        for (int i=0;i<nums.length;i++){
            product*=nums[i];
        }
        System.out.println(product);

        result=signFunc(product);
        return result;
    }
    public static int signFunc(double x){
        if (x>0){
            return 1;
        }
        else if (x<0){
            return -1;
        }
        else {
            return 0;
        }

    }
}
