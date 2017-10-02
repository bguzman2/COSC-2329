package dominoes;

import java.util.Set;

public class DominoHighLowImpl implements Domino{
    private int highPipCount;
    private int lowPipCount;

    public DominoHighLowImpl(int highPipCount, int lowPipCount) {
        this.highPipCount = highPipCount;
        this.lowPipCount = lowPipCount;
    }

    public static final char HIGH_LOW_SEPARATOR = ':';

    public static boolean isHighLowString(String str){
        int separatorIndex = str.indexOf(HIGH_LOW_SEPARATOR);

        String highString = str.substring(0,separatorIndex);
        String lowString = str.substring(separatorIndex+1);

        int highInt = Integer.parseInt(highString);
        int lowInt = Integer.parseInt(lowString);

        return(highInt >= lowInt);

    }

    public DominoHighLowImpl(String highLowString){
        int separatorIndex = highLowString.indexOf(HIGH_LOW_SEPARATOR);

        String highString = highLowString.substring(0,separatorIndex);
        String lowString = highLowString.substring(separatorIndex+1);

        highPipCount = Integer.parseInt(highString);
        lowPipCount = Integer.parseInt(lowString);

    }

    public static final int INDEX_OF_SUM = 0;
    public static final int INDEX_OF_DIFFERENCE = 1;

    public DominoHighLowImpl(int[] sumDifference){
        int sum = sumDifference[INDEX_OF_SUM];
        int difference = sumDifference[INDEX_OF_DIFFERENCE];

        //High Plus Low = sum
        //High - Low = difference





    }

    public DominoHighLowImpl(Set<Integer> highLowSet){
        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);


        if(highLowArray.length > 1) {

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





    public int getLowPipCount(){
        return lowPipCount;
    }

    public int getHighPipCount(){
        return highPipCount;
    }







}
