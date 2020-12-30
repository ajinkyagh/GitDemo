package clean_strike;

public class CaromBoard {
    public int blackCoinCount, redCoinCount;

    void declareCount(){
        this.redCoinCount=1;
        this.blackCoinCount=9;
    }

    void strike(){
        updateBlackCount(-1);
    }

    void multiStrike(){
        updateBlackCount(-2);
    }

    void redStrike(){
        updateRedCount(-1);
    }

    void defunctRedCoin(){
        updateRedCount(-1);
    }

    void defunctBlackCoin(){
        updateBlackCount(-1);
    }

    int showBlackCount(){
        return this.blackCoinCount;
    }

    int showRedCount(){
        return this.redCoinCount;
    }

    boolean noCoinsRemain(){
        if (this.blackCoinCount<=0 && this.redCoinCount<=0) {
            return false;
        }
        return false;
    }

    private void updateRedCount(int i) {
        this.redCoinCount+=i;
        if (this.redCoinCount<0){
            this.redCoinCount-=i;
        }

    }

    private void updateBlackCount(int i) {
        this.blackCoinCount+=i;
        if(this.blackCoinCount<0){
            this.blackCoinCount-=i;
        }

    }

}