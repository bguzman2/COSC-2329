package utils;

/**
 * Created by jacobbeneski on 9/18/17.
 */
public interface IntegerUtils {

    //Tests to see if the value is even.
    public static boolean isEven(int k) {

        return (k % 2 == 0);

    }

    //Tests to see if the value is odd.
    public static boolean isOdd(int k) {

        return (k % 2 == 1);
    }

    //Tests to see if the value is prime.
    public static boolean isPrime(int k) {

        //Check if k is a multiple of 2 or less than 1
        if ((k % 2 == 0) || (k <= 1))
            return false;
        //if not, then just check the odds if they are divisible.
        for (int i = 3; i * i <= k; i += 2) {
            if (k % i == 0)
                return false;
        }
        return true;
    }

    //Calculates the greatest common factor of two values.
    public static int greatestCommonFactor(int m, int n) {
        assert !(m == 0 && n == 0) : "M and N are both Zero!";

        //If either variable is 0, return the nonzero value.
        if ((m == 0) || (n == 0))
            return m + n;
        //Else recurse until one value is 0.
        return Math.abs(greatestCommonFactor(n, m % n));
    }

    //Calculates the greatest value withing a constrained maximum.
    public static int getGreatestConstrainedMultiple(int k, int maximum) {
        return (k * (maximum / k));
    }


    public static int getIntegerH(int h_q_3, int h_r_5) {

        // H/3 = h_q_3;
        // H%5 = h_r_5;
        //Find X

        //Sets an initial value.
        int firstValue = h_q_3 * 3;

        //Check if the value is divisible by 3 and mod 5.
        for (int i = firstValue; i < h_q_3 * 4; i++){
            if (i / 3 == h_q_3 && i % 5 == h_r_5){
                return i;
            }
        }
        return firstValue;
    }

    //Returns the maximum value in an array.
    public static int getMaximum(int[] intArray) {

        //Sets a temporary max to the first value in the array.
        int tempMax = intArray[0];

        //Iterate through the array to see if any value is bigger than tempMax.
        for (int i = 1; i < intArray.length; i++) {

            if (intArray[i] > tempMax) {
                tempMax = intArray[i];
            }

        }

        return tempMax;

    }

    //Returns the mimimum value in an array.
    public static int getMinimum(int[] intArray) {

        //Sets a temporary min to the first value in the array.
        int tempMin = intArray[0];

        //Iterate through the array to see if any value is less than tempMin.
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < tempMin) {
                tempMin = intArray[i];
            }

        }

        return tempMin;
    }

    //Checks to see if an array is sorted.
    public static boolean isSorted(int[] intArray) {

        //Iterate through the array to see if any values are out of order.

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }

        //If no values are out of order, we can assume it is in order.
        return true;

    }


    //Returns to smallest index of a target value.
    public static int NO_MATCH = -1;

    public static int getSmallestIndexOfMatch(int[] intArray, int target) {

        //Iterate through the array to find the value, and return index.
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] == target)
                return i;
        }

        return NO_MATCH;
    }


}
