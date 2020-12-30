package clean_strike;

public class Points {
    static final int striker_Score=1;
    static final int multi_Striker_Score=2;
    static final int red_Striker_Score=3;
    static final int striker_Strike_Score=-1;
    static final int defunct_Coin_Score=-2;
    public Players[] players=new Players[2];

    void declare(){
        players[0]=new Players();
        players[1]=new Players();
    }

    void fetchPlayerScore(){

    }

    void strike(){

    }

    void multiStrike(){

    }

    void redStrike(){

    }

    void strikerStrike(){

    }

    void defunctCoin(int playerNo){

    }

    void noStrike(){

    }


}
