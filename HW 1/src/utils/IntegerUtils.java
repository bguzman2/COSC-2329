package utils;

/**
 * Created by jacobbeneski on 9/18/17.
 */
public interface IntegerUtils {

    public static boolean isEven(int k){

        return (k % 2 == 0);

    }

    public static boolean isOdd(int k){

        return (k % 2 == 1);
    }

    public static boolean isPrime(int k){
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    public static int greatestCommonFactor(int m, int n){
        assert !(m == 0 && n == 0) : "M and N are both Zero!";

        throw new RuntimeException("NOT IMPLEMENTED");
    }

    public static int getGreatestConstrainedMultiple(int k, int maximum){
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    public static int getIntegerH(int h_q_3, int h_r_5){
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    public static int getMaximum(int [] intArray) {

        int tempMax = intArray[0];

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i++] >= tempMax) {
                tempMax = intArray[i++];
            }

        }

        return tempMax;

    }

    public static int getMinimum(int[] intArray){
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    public static boolean isSorted(int[] intArray){

        boolean sorted = true;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] <= intArray[i++]){

                //TODO
                return false;

            }
        }

        //TODO
        return false;

    }

    public static int getSmallestIndexOfMatch(int[] intArray, int target){
        throw new RuntimeException("NOT IMPLEMENTED");
    }

























}
