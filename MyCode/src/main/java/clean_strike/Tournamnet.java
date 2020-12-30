package clean_strike;
import clean_strike.Main;

public class Tournamnet {
    public  static void printPlayerOptions(int player){
        System.out.println("\nPlayer " + player + ": Choose an outcome from the list below\n" );
        System.out.println("1. Strike");
        System.out.println("2. Multistrike");
        System.out.println( "3. Red strike");
        System.out.println("4. Striker strike");
        System.out.println( "5. Defunct Red coin");
        System.out.println( "6. Defunct Black coin");
        System.out.println("7. None");

    }
}
