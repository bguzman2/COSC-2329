package dominoes;

public class DominoLowDifferenceStringImpl implements Domino{

    private String lowDifferenceString;
    private static final char LOW_DIFFERENCE_DELIMITER = '*';

    public DominoLowDifferenceStringImpl(int lowPlus8TimesHigh){

        int low = (lowPlus8TimesHigh % 8);

        int high = (lowPlus8TimesHigh - low) / 8;

        int difference = high - low;

        lowDifferenceString = low + "*" + difference;
    }



    public int getLowPipCount(){


        return 5;
    }

    public int getHighPipCount(){
        return 5;
    }



}
