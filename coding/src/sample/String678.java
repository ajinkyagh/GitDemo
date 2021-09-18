package sample;

import java.util.Stack;

public class String678 {
    public static void main(String[] args){
        System.out.println(checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }
    public static boolean checkValidString(String s) {
        Stack<String> stack=new Stack<>();
        int length=s.length();
        System.out.println(length);
        for (int i=0;i<s.length();i++){
            if (length%2!=0){
                if (s.charAt(i)=='('){
                    stack.push("(");
                }
                else if (s.charAt(i)=='*'){
                   continue;
                }
                else {
                    if (!stack.empty()){
                        if (s.charAt(i)==')'){
                            stack.pop();
                        }
                    }
                    else {
                        return false;
                    }

                }
            }
            else {
                if (s.charAt(i)=='('){
                    stack.push("(");
                }
                else if (s.charAt(i)=='*'){
                    stack.push("*");
                }
                else if (s.charAt(i)==')'){
                    stack.pop();
                }
            }

        }
        if (stack.isEmpty()){
           return true;
        }
        else {
            return false;
        }

    }
}
