package dominoes;

import java.util.Set;

public class DominoHighLowImpl_Beneski implements Domino {
    private int highPipCount;
    private int lowPipCount;

    //Takes two ints
    public DominoHighLowImpl_Beneski(int highPipCount, int lowPipCount) {
        assert (highPipCount >= MINIMUM_PIP_COUNT) : "High Pip count: " + highPipCount + " isn't larger than MIN PIP COUNT";
        assert (highPipCount <= MAXIMUM_PIP_COUNT) : "High Pip Count: " + highPipCount + " isn't smaller than MAX PIP COUNT";
        assert (lowPipCount >= MINIMUM_PIP_COUNT) : "Low Pip Count: " + lowPipCount + " isn't larger than MIN PIP COUNT";
        assert (lowPipCount <= MAXIMUM_PIP_COUNT) : "Low Pip count: " + lowPipCount + " isn't lower than MAX PIP COUNT";
        assert (lowPipCount <= highPipCount) : "Low Pip Count isn't lower than High Pip Count";

        //If the high and low pip count are less than max, set the variables.
        this.highPipCount = highPipCount;
        this.lowPipCount = lowPipCount;
    }

    public static final char HIGH_LOW_SEPARATOR = ':';


    //No Preconditions are Required.
    //Checks if a string is a valid HighLowString
    public static boolean isHighLowString(String str) {

        boolean isHighLowString = false;

        //Finds the middle of the String
        int separatorIndex = str.indexOf(HIGH_LOW_SEPARATOR);

        if (separatorIndex != -1) {



            //Split the string into two substrings
            String highString = str.substring(0, separatorIndex);
            String lowString = str.substring(separatorIndex + 1);

            //Set the local variables
            int highInt = Integer.parseInt(highString);
            int lowInt = Integer.parseInt(lowString);



            if ((highInt <= MAXIMUM_PIP_COUNT) && (highInt >= MINIMUM_PIP_COUNT) && (lowInt <= MAXIMUM_PIP_COUNT) && (lowInt >= MINIMUM_PIP_COUNT))
                isHighLowString = true;

        }


        return isHighLowString;
    }


    //Takes a valid HighLowString.
    public DominoHighLowImpl_Beneski(String highLowString) {

        assert (isHighLowString(highLowString)) : "The String is Not A Valid High Low String";

        //Finds the middle of the String
        int separatorIndex = highLowString.indexOf(HIGH_LOW_SEPARATOR);

        //Split the string into two substrings
        String highString = highLowString.substring(0, separatorIndex);
        String lowString = highLowString.substring(separatorIndex + 1);

        //Set the local ints
        highPipCount = Integer.parseInt(highString);
        lowPipCount = Integer.parseInt(lowString);

    }

    public static final int INDEX_OF_SUM = 0;
    public static final int INDEX_OF_DIFFERENCE = 1;

    //Takes a valid sum difference array.
    public DominoHighLowImpl_Beneski(int[] sumDifference) {


        assert (sumDifference.length == 2) : "Sum Difference Array is Too Short";

        int sum = sumDifference[INDEX_OF_SUM];
        int difference = sumDifference[INDEX_OF_DIFFERENCE];


        assert (((sum % 2 == 0) && (difference % 2 == 0)) || ((sum % 2 == 1) && (difference % 2 == 1))) : "Sum and Difference are not both even / odd.";
        assert (sum >= difference) : "The Sum Must be Bigger than the difference";

        int doubleMystery = sum + difference;

        int numberOne = doubleMystery / 2;
        int numberTwo = numberOne - difference;

        this.highPipCount = numberOne;
        this.lowPipCount = numberTwo;

    }

    //Takes a valid high low set.
    public DominoHighLowImpl_Beneski(Set<Integer> highLowSet) {

        assert (!highLowSet.contains(null)) : "The Set Cannot Contain Null";
        assert (highLowSet.size() >= 1) : "The Size of the set must be at least 1";

        //Since there is no order to a set the set <5,4> is equivalent to <4,5>.

        //Convert the set to an array, because they are easier to work with,
        // and there is not disadvantage at the scale we are working at.
        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);


        //If the array is bigger than 1, get the two values.
        if (highLowArray.length > 1) {

            int valueOne = highLowArray[0];
            int valueTwo = highLowArray[1];

            assert (valueOne <= MAXIMUM_PIP_COUNT) : "Value One is not less than Max Pip Count";
            assert (valueOne >= MINIMUM_PIP_COUNT) : "Value One is not more than Min Pip Count";
            assert (valueTwo <= MAXIMUM_PIP_COUNT) : "Value Two is not less than Max Pip Count";
            assert (valueTwo >= MINIMUM_PIP_COUNT) : "Value Two is not more than Min Pip Count";


            //Find the bigger and smaller values.
            if (valueOne >= valueTwo) {
                highPipCount = valueOne;
                lowPipCount = valueTwo;
            } else {
                highPipCount = valueTwo;
                lowPipCount = valueOne;
            }
            //If the array only has one value, set both high and low to that value.
        } else {
            assert (highLowArray[0] <= MAXIMUM_PIP_COUNT) : "Value is not smaller than max pip count";
            assert (highLowArray[0] >= MINIMUM_PIP_COUNT) : "Value is not larger than min pip count";

            highPipCount = highLowArray[0];
            lowPipCount = highLowArray[0];
        }


    }

    //Returns Low Pip Count
    public int getLowPipCount() {
        return lowPipCount;
    }

    //Returns High Pip Count
    public int getHighPipCount() {
        return highPipCount;
    }


}
