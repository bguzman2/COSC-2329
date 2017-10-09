package dominoes;

import java.util.List;

public class DominoLowDifferenceStringImpl_Beneski implements Domino{

    private String lowDifferenceString;
    private static final char LOW_DIFFERENCE_DELIMITER = '*';

    public DominoLowDifferenceStringImpl_Beneski(int lowPlus8TimesHigh){

        int low = (lowPlus8TimesHigh % 8);

        int high = (lowPlus8TimesHigh - low) / 8;

        int difference = high - low;

        lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;
    }

    public static final int INDEX_OF_HIGH = 0;
    public static final int INDEX_OF_SUM = 1;

    public DominoLowDifferenceStringImpl_Beneski(List<Integer> highSum){

        int high = highSum.get(INDEX_OF_HIGH);
        int sum = highSum.get(INDEX_OF_SUM);
        int low = sum - high;
        int difference = high - low;


        lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;

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
