package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class BracketPairs1807 {
    public static String evaluate(String s, List<List<String>> knowledge) {
        boolean flag = false;
        //String s1 = "";
        StringBuilder sb=new StringBuilder();
        List<String> stringList = new ArrayList<>();
        HashMap<String, String> map=new HashMap<>();
        for (int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                flag = true;
                i++;
            }
            if (s.charAt(i) == ')') {
                flag = false;
                stringList.add(String.valueOf(sb));
                sb=new StringBuilder();
               // s1 = "";
            }
            if (flag) {
                //s1 += s.charAt(i);
                sb.append(s.charAt(i));
            }
        }
        if (knowledge.size() == 0) {
            for (int i = 0; i < stringList.size(); i++) {
                s = s.replace("(" + stringList.get(i) + ")", "?");
            }
        } else {
            for (int i = 0; i < stringList.size(); i++) {
                    if (stringList.get(i) == null) {
                        s = s.replace("( )", "?");
                    } else if (map.get(stringList.get(i))!=null) {
                        s = s.replace("(" + stringList.get(i) + ")", map.get(stringList.get(i)));
                    } else{
                        s = s.replace("(" + stringList.get(i) + ")", "?");
                    }
            }


        }
        return s;
    }

    public static void main(String[] args) {
        List<List<String>> list = asList(asList("name", "bob"), asList("age", "two"));
        System.out.println(evaluate("(name)is(age)yearsold", list));
    }

}
