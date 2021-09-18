package sample;

import java.util.Locale;

public class StringHalves {
    public static boolean halvesAreAlike(String s) {
        int len=s.length();
        int half=len/2;
        String a=s.substring(0,half).toLowerCase();
        String b=s.substring(half).toLowerCase();
        int count=0,count2=0;
        for(int i=0;i<half;i++){
            if(isVowel(a.charAt(i))){
                count++;
            }
            if(isVowel(b.charAt(i))){
                count2++;
            }
        }
        return count == count2;
    }
    public static boolean isVowel(char letter){

       return letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u';
    }
    public static void main(String[] args){
        System.out.println(halvesAreAlike("book"));
    }
}
