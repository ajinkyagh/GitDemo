package sample;

import java.util.Stack;

public class BaseballGame {
    public static void calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<>();
        int sum=0;
        for(int i=0;i<ops.length;i++){
            switch (ops[i]) {
                case "C" -> {
                    stk.pop();
                }
                case "D" -> {
                    int b = stk.peek();
                    b = b * 2;
                    stk.push(b);
                }
                case "+" -> {
                    int c=stk.peek();
                    stk.pop();
                    int d=stk.peek();
                    stk.pop();
                    int e=c+d;
                    stk.push(d);
                    stk.push(c);
                    stk.push(e);
                }
                default -> {
                    int a = Integer.parseInt(ops[i]);
                    stk.push(a);
                }
            }
        }

        while (stk.size() > 0) sum += stk.pop();
        System.out.println(sum);


    }
    public static void main(String[] args){
        String[] ops={"1","C","-62","-45","-68"};
        calPoints(ops);
    }
}
