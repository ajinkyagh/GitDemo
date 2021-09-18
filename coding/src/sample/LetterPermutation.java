package sample;

import java.util.ArrayList;
import java.util.List;

public class LetterPermutation {
    public static void main(String[] args){
        System.out.println(letterCasePermutation("a1b2"));
    }
    public static List<String> letterCasePermutation(String S) {
     List<String>list=new ArrayList<>();
     String z="";
      list.add(S);
      list.add(S.toUpperCase());



      return list;
    }
}
