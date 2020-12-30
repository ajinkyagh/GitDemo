package clean_strike;

import java.util.Scanner;

import static clean_strike.Tournamnet.printPlayerOptions;

public class Main {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int playerMove=scanner.nextInt();
        printPlayerOptions(1);
    }


}
