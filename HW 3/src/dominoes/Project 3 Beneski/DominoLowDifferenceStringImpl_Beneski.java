package dominoes;

import java.util.List;

public class DominoLowDifferenceStringImpl_Beneski implements Domino {

    private String lowDifferenceString;
    private static final char LOW_DIFFERENCE_DELIMITER = '*';

    public DominoLowDifferenceStringImpl_Beneski(int lowPlus8TimesHigh) {

        assert (0 <= lowPlus8TimesHigh) : "The Provided Value is not a valid Low Plus 8 Times High";
        assert (lowPlus8TimesHigh <= 54) : "The Provided Value is not a valid Low Plus 8 Times High";
        assert (8 * (lowPlus8TimesHigh) / 8 <= lowPlus8TimesHigh) : "The Provided Value is not a valid Low Plus 8 Times High";
        assert (lowPlus8TimesHigh <= 9 * (lowPlus8TimesHigh) / 8) : "The Provided Value is not a valid Low Plus 8 Times High";

        int low = (lowPlus8TimesHigh % 8);

        int high = (lowPlus8TimesHigh - low) / 8;

        int difference = high - low;

        lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;
    }

    public static final int INDEX_OF_HIGH = 0;
    public static final int INDEX_OF_SUM = 1;

    public DominoLowDifferenceStringImpl_Beneski(List<Integer> highSum) {

        assert (highSum.size() == 2);
        assert (!highSum.contains(null)) : "High Sum Cannot contain Null";

        //Get the High and Sum Values
        int high = highSum.get(INDEX_OF_HIGH);
        int sum = highSum.get(INDEX_OF_SUM);

        assert (high <= sum) : "The Sum Must be Greater or Equal to The High Value";

        //FInd Low
        int low = sum - high;

        assert (high >= MINIMUM_PIP_COUNT) : "High Pip count: " + high + " isn't larger than MIN PIP COUNT";
        assert (high <= MAXIMUM_PIP_COUNT) : "High Pip Count: " + high + " isn't smaller than MAX PIP COUNT";
        assert (low >= MINIMUM_PIP_COUNT) : "Low Pip Count: " + low + " isn't larger than MIN PIP COUNT";
        assert (low <= MAXIMUM_PIP_COUNT) : "Low Pip count: " + low + " isn't lower than MAX PIP COUNT";


        //FInd the Difference
        int difference = high - low;


        lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;

    }


    //Return the Low Pip Count
    public int getLowPipCount() {

        int delimiterIndex = lowDifferenceString.indexOf(LOW_DIFFERENCE_DELIMITER);

        String lowString = lowDifferenceString.substring(0, delimiterIndex);

        int low = Integer.parseInt(lowString);

        return low;
    }

    //Return the High Pip Count
    public int getHighPipCount() {


        int delimiterIndex = lowDifferenceString.indexOf(LOW_DIFFERENCE_DELIMITER);

        String lowString = lowDifferenceString.substring(0, delimiterIndex);
        String differenceString = lowDifferenceString.substring(delimiterIndex + 1);

        int low = Integer.parseInt(lowString);
        int difference = Integer.parseInt(differenceString);

        int high = low + difference;

        return high;
    }


}
