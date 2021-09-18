package sample;

public class TruncateSentence {
    public static void truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String s1="";
        for (int i=0;i<k;i++){
            s1+=arr[i];
            if(i!=k-1){
                s1+=" ";
            }
        }

        System.out.println(s1);


    }
    public static void main(String[] args){
        truncateSentence("Hello how are you Contestant",4);
    }
}
