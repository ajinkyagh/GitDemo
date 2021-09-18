package sample;

import java.util.Arrays;

public class CheckASentence1832 {
    public static void main(String[] args){
        System.out.println(checkIfPangram( "thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        Boolean[] arr=new Boolean[26];
        int j=0;
      for (char i='a';i<='z';i++){
            if (sentence.contains(String.valueOf(i))){
                arr[j]=true;
                j++;
            }
            else {
                arr[j]=false;
                j++;
            }
      }
      for ( j=0;j< arr.length;j++){
         if (!arr[j]){
             return false;
         }
      }
      return true;
    }
}

