package sample;
import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<String> st= new Stack<String>();
        for(int i=0;i<s.length();i++){
            String s1= String.valueOf(s.charAt(i));
            if(s1.equals("(") || s1.equals("{") || s1.equals("["))
            {
                st.push(s1);
            }
            else
            {
                if(st.empty()){
                    return false;
                }
                else if(s1.equals(")") && st.peek().equals("("))
                {
                    st.pop();
                }
                else if(s1.equals("}") && st.peek().equals("{")){
                    st.pop();
                }
                else if(s1.equals("]") && st.peek().equals("[")){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));

    }
}

