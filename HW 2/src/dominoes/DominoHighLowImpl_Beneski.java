package dominoes;

import java.util.Set;

public class DominoHighLowImpl_Beneski implements Domino {
    private int highPipCount;
    private int lowPipCount;

    public DominoHighLowImpl_Beneski(int highPipCount, int lowPipCount) {
        //If the high and low pip count are less than max, set the variables
        if ((highPipCount <= MAXIMUM_PIP_COUNT) && (lowPipCount >= MINIMUM_PIP_COUNT)) {
            this.highPipCount = highPipCount;
            this.lowPipCount = lowPipCount;
        } else throw new RuntimeException("Value is outide of preconditions");
    }

    public static final char HIGH_LOW_SEPARATOR = ':';

    //Checks if a string is a valid HighLowString
    public static boolean isHighLowString(String str) {
        //Finds the middle of the String
        int separatorIndex = str.indexOf(HIGH_LOW_SEPARATOR);

        //Split the string into two substrings
        String highString = str.substring(0, separatorIndex);
        String lowString = str.substring(separatorIndex + 1);

        //Set the local variables
        int highInt = Integer.parseInt(highString);
        int lowInt = Integer.parseInt(lowString);

        return (highInt >= lowInt);

    }

    //Takes a valid HighLowString and sets the variables
    public DominoHighLowImpl_Beneski(String highLowString) {
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

    //Takes a valid sum difference array and sets the local variables
    public DominoHighLowImpl_Beneski(int[] sumDifference) {
        int sum = sumDifference[INDEX_OF_SUM];
        int difference = sumDifference[INDEX_OF_DIFFERENCE];

        int doubleMystery = sum + difference;

        int numberOne = doubleMystery / 2;
        int numberTwo = numberOne - difference;

        this.highPipCount = numberOne;
        this.lowPipCount = numberTwo;

    }

    //Takes a valid high low set and sets the local variables
    public DominoHighLowImpl_Beneski(Set<Integer> highLowSet) {
        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);


        if (highLowArray.length > 1) {

            int valueOne = highLowArray[0];
            int valueTwo = highLowArray[1];

            if (valueOne >= valueTwo) {
                highPipCount = valueOne;
                lowPipCount = valueTwo;
            } else {
                highPipCount = valueTwo;
                lowPipCount = valueOne;
            }
        } else {
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
