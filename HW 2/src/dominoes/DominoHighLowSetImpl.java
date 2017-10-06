package dominoes;
import java.util.HashSet;
import java.util.Set;

public class DominoHighLowSetImpl implements Domino{

    private Set<Integer> highLowSet;

    public DominoHighLowSetImpl(int highPipCount, int lowPipCount){

        highLowSet = new HashSet<>();

        if((highPipCount <= MAXIMUM_PIP_COUNT) && (lowPipCount >= MINIMUM_PIP_COUNT)){
            highLowSet.add(highPipCount);
            highLowSet.add(lowPipCount);
        }

    }

    public static final char SUM_DIFFERENCE_DELIMITER = ',';

    public static boolean isSumDifferenceString(String str){


        int delimiterIndex = str.indexOf(SUM_DIFFERENCE_DELIMITER);

        String sumString = str.substring(0,delimiterIndex);
        String differenceString = str.substring(delimiterIndex+1);

        int sum = Integer.parseInt(sumString);
        int difference = Integer.parseInt(differenceString);


        //The sum has to be greater than the difference.
        return (sum > difference);

    }

    public DominoHighLowSetImpl(String sumDifferenceString){

        highLowSet = new HashSet<>();

        int delimiterIndex = sumDifferenceString.indexOf(SUM_DIFFERENCE_DELIMITER);

        String sumString = sumDifferenceString.substring(0,delimiterIndex);
        String differenceString = sumDifferenceString.substring(delimiterIndex+1);

        int sum = Integer.parseInt(sumString);
        int difference = Integer.parseInt(differenceString);

        int doubleMystery = sum + difference;
        int numberOne = doubleMystery / 2;
        int numberTwo = numberOne - difference;

        highLowSet.add(numberOne);
        highLowSet.add(numberTwo);

    }

    public static boolean isLowPlus8TimesHighInteger(int k){

        //low + (8 * high);

        int low = (k % 8);

        int high = (k - low) / 8;


        return true;
    }

    public DominoHighLowSetImpl(int lowPlus8TimesHigh){

        highLowSet = new HashSet<>();

        int low = (lowPlus8TimesHigh % 8);

        int high = (lowPlus8TimesHigh - low) / 8;

        highLowSet.add(high);
        highLowSet.add(low);

    }

    public int getLowPipCount(){

        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);

        int valueOne = highLowArray[0];
        int valueTwo = highLowArray[1];

        int returnValue;

        if(valueOne >= valueTwo){
            returnValue = valueTwo;
        } else {
            returnValue = valueOne;
        }

        return returnValue;

    }

    public int getHighPipCount(){

        Integer[] highLowArray = highLowSet.toArray(new Integer[highLowSet.size()]);

        int valueOne = highLowArray[0];
        int valueTwo = highLowArray[1];

        int returnValue;

        if(valueOne <= valueTwo){
            returnValue = valueTwo;
        } else{
            returnValue = valueOne;
        }

        return returnValue;
    }
}
