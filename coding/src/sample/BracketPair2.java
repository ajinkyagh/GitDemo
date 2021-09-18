package sample;

import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.fill;

public class BracketPair2 {
    public static String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map=new HashMap<>();
        boolean flag=false;
        for (List<String> strings : knowledge) {
            map.put(strings.get(0), strings.get(1));
        }
        StringBuilder Final=new StringBuilder();
        StringBuilder initial = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i)!='(' && s.charAt(i)!='(' && !flag){
                Final.append(s.charAt(i));
            }
            if (s.charAt(i) == '(') {
                flag = true;
                i++;
            }
            if (s.charAt(i) == ')') {
                flag=false;
                if (map.get(String.valueOf(initial)) != null) {
                    Final.append(map.get(String.valueOf(initial)));
                }
                else {
                    Final.append("?");
                }
                initial=new StringBuilder();
            }
            if (flag){
                initial.append(s.charAt(i));
            }
        }
        String s1=String.valueOf(Final);
        return s1;

    }
    public static void main(String[] args){
        List<List<String>> list = asList(asList("name", "bob"), asList("age", "two"));
        System.out.println(evaluate("(name)is(age)yearsold", list));
    }
}
