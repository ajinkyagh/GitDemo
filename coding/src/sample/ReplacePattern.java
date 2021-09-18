package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        for (int i=0;i<words.length;i++){
            HashMap<Character,Character> map=new HashMap<>();
            HashMap<Character,Character> curr=new HashMap<>();
            boolean flag=true;
            for (int j=0;j<words[i].length();j++) {
                char a = words[i].charAt(j);
                char b = pattern.charAt(j);

                if (!map.containsKey(a)) {
                    map.put(a, b);
                }
                if (!curr.containsKey(b)) {
                    curr.put(b, a);
                }
                if (map.get(a) != b || curr.get(b) != a) {
                    flag = false;
                }

            }
            if (flag){
                list.add(words[i]);
            }


        }
        return list;


    }

        public static void main (String[]args){
            String[] arr = {"abc","deq","mee","aqq","dkd","ccc"};


            // System.out.println(a.charAt(0));
            System.out.println(findAndReplacePattern(arr, "abb"));
        }
    }

