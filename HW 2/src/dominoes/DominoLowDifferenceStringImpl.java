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

        int delimiterIndex = lowDifferenceString.indexOf(LOW_DIFFERENCE_DELIMITER);

        String lowString = lowDifferenceString.substring(0,delimiterIndex);
        String differenceString = lowDifferenceString.substring(delimiterIndex+1);

        int low = Integer.parseInt(lowString);

        return low;
    }

    public int getHighPipCount(){


        int delimiterIndex = lowDifferenceString.indexOf(LOW_DIFFERENCE_DELIMITER);

        String lowString = lowDifferenceString.substring(0,delimiterIndex);
        String differenceString = lowDifferenceString.substring(delimiterIndex+1);

        int low = Integer.parseInt(lowString);
        int difference = Integer.parseInt(differenceString);

        int high = low + difference;


        return high;
    }



}
