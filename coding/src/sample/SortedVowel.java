package sample;

public class SortedVowel {
    public static int countVowelStrings(int n) {
        int count=0;
        char[] arr={'a','e','i','o','u'};
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                count++;
            }
        }


    return count;
    }
    public static void main(String[] args){
        System.out.println(countVowelStrings(33));
    }
}
