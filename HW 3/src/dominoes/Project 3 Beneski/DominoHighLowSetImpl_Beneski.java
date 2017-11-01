package dominoes;

import java.util.HashSet;
import java.util.Set;

public class DominoHighLowSetImpl_Beneski implements Domino {

    private Set<Integer> highLowSet;

    public DominoHighLowSetImpl_Beneski(int highPipCount, int lowPipCount) {

        assert (highPipCount >= MINIMUM_PIP_COUNT) : "High Pip count: " + highPipCount + " isn't larger than MIN PIP COUNT";
        assert (highPipCount <= MAXIMUM_PIP_COUNT) : "High Pip Count: " + highPipCount + " isn't smaller than MAX PIP COUNT";
        assert (lowPipCount >= MINIMUM_PIP_COUNT) : "Low Pip Count: " + lowPipCount + " isn't larger than MIN PIP COUNT";
        assert (lowPipCount <= MAXIMUM_PIP_COUNT) : "Low Pip count: " + lowPipCount + " isn't lower than MAX PIP COUNT";
        assert (lowPipCount <= highPipCount) : "Low Pip Count isn't lower than High Pip Count";


        highLowSet = new HashSet<>();

        highLowSet.add(highPipCount);
        highLowSet.add(lowPipCount);

    }

    public static final char SUM_DIFFERENCE_DELIMITER = ',';

    public static boolean isSumDifferenceString(String str) {

        boolean isSumDifferenceString = false;

        //Find the split.
        int delimiterIndex = str.indexOf(SUM_DIFFERENCE_DELIMITER);

        if (delimiterIndex != -1) {

            //Split the string into substrings.
            String sumString = str.substring(0, delimiterIndex);
            String differenceString = str.substring(delimiterIndex + 1);

            //Get the int values from the strings.
            int sum = Integer.parseInt(sumString);
            int difference = Integer.parseInt(differenceString);


            //Test if the two values are valid to make a sum difference domino within constraints.
            int total = sum + difference;

            int numberOne = total / 2;
            int numberTwo = numberOne - difference;

            if ((numberOne <= MAXIMUM_PIP_COUNT) && (numberOne >= MINIMUM_PIP_COUNT) && (numberTwo <= MAXIMUM_PIP_COUNT) && (numberTwo >= MINIMUM_PIP_COUNT))
                isSumDifferenceString = true;

        }

        return isSumDifferenceString;

    }

    public DominoHighLowSetImpl_Beneski(String sumDifferenceString) {

        assert (isSumDifferenceString(sumDifferenceString)) : "Not a Valid Sum Difference String";

        highLowSet = new HashSet<>();

        int delimiterIndex = sumDifferenceString.indexOf(SUM_DIFFERENCE_DELIMITER);

        //Split the string into substrings
        String sumString = sumDifferenceString.substring(0, delimiterIndex);
        String differenceString = sumDifferenceString.substring(delimiterIndex + 1);

        //Get the sum and difference
        int sum = Integer.parseInt(sumString);
        int difference = Integer.parseInt(differenceString);

        //FInd the high and low pip count.
        int doubleMystery = sum + difference;
        int numberOne = doubleMystery / 2;
        int numberTwo = numberOne - difference;

        highLowSet.add(numberOne);
        highLowSet.add(numberTwo);

    }

    public static boolean isLowPlus8TimesHighInteger(int k) {

        //low + (8 * high);

        int low = (k % 8);

        int high = (k - low) / 8;


        return true;

    }

    public DominoHighLowSetImpl_Beneski(int lowPlus8TimesHigh) {

        assert (0 <= lowPlus8TimesHigh) : "The Provided Value is not a valid Low Plus 8 Times High";
        assert (lowPlus8TimesHigh <= 54) : "The Provided Value is not a valid Low Plus 8 Times High";
        assert (8 * (lowPlus8TimesHigh) / 8 <= lowPlus8TimesHigh) : "The Provided Value is not a valid Low Plus 8 Times High";
        assert (lowPlus8TimesHigh <= 9 * (lowPlus8TimesHigh) / 8) : "The Provided Value is not a valid Low Plus 8 Times High";

        highLowSet = new HashSet<>();

        //Find low
        int low = (lowPlus8TimesHigh % 8);

        //Find High
        int high = (lowPlus8TimesHigh - low) / 8;

        highLowSet.add(high);
        highLowSet.add(low);

    }

    public int getLowPipCount() {

        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);
        int returnValue;

        if (highLowSet.size() > 1) {
            int valueOne = highLowArray[0];
            int valueTwo = highLowArray[1];


            if (valueOne >= valueTwo) {
                returnValue = valueTwo;
            } else {
                returnValue = valueOne;
            }
        } else {
            returnValue = highLowArray[0];
        }

        return returnValue;

    }

    public int getHighPipCount() {
        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);

        int returnValue;

        if (highLowSet.size() > 1) {


            int valueOne = highLowArray[0];
            int valueTwo = highLowArray[1];


            if (valueOne <= valueTwo) {
                returnValue = valueTwo;
            } else {
                returnValue = valueOne;
            }

        } else {
            returnValue = highLowArray[0];
        }
        return returnValue;
    }
}
