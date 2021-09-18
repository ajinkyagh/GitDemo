package sample;

public class RobotReturn {
    public static void main(String[] args){
        System.out.println(judgeCircle("RLUURDDDLU"));
    }
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;
        boolean flag = false;
        char[] arr=moves.toCharArray();
        for (int i=0;i<arr.length;i++){

            if (arr[i]=='U'){
                y=y+1;
            }
            if (arr[i]=='D'){
                y=y-1;
            }
            if (arr[i]=='L'){
                x=x+1;
            }
            if (arr[i]=='R'){
                x=x-1;
            }

        }
        if (x==0 && y==0){
            flag=true;
        }

        return flag;
    }

}
