package sample;

import java.util.Stack;

public class GoalParser {
    public static void main(String[] args){
        interpret("G()()()()(al)");

    }
    public static void interpret(String command) {
        Stack<String> stk=new Stack<>();
        String cmd="";
        for (int i=0;i<command.length();i++){
            if (command.charAt(i)=='G'){
                cmd+="G";
            }
            else if (command.charAt(i)=='('){
                stk.push("(");
            }
            else if (command.charAt(i)=='a'){
                stk.push("a");
                cmd+="a";
            }
            else if ( command.charAt(i)=='l'){
                stk.push("l");
                cmd+="l";
            }
             else if (command.charAt(i)==')' && stk.peek().equals("(")){
                stk.pop();
                cmd+="o";
            }
        }
        System.out.println(cmd);

    }
}
