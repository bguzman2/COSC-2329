import utils.IntegerUtils;

/**
 * Created by jacobbeneski on 9/18/17.
 */
public class driver {
    public static void main(String [] args){

        int[] intArray = {1,3,5,7,9,2,6,11};

        //Check isEven()
        System.out.println("Checking isEven()");
        System.out.println(IntegerUtils.isEven(3));
        System.out.println(IntegerUtils.isEven(0));
        System.out.println(IntegerUtils.isEven(-2));

        //Check isOdd()
        System.out.println("Checking isOdd()");
        System.out.println("3" + IntegerUtils.isOdd(3));
        System.out.println("0" + IntegerUtils.isOdd(0));
        System.out.println("-2 " + IntegerUtils.isOdd(-2));

        System.out.println("Checking isPrime()");
        System.out.println("-3 " + IntegerUtils.isPrime(-3));
        System.out.println("0 " + IntegerUtils.isPrime(0));
        System.out.println("1 " + IntegerUtils.isPrime(1));
        System.out.println("23 " + IntegerUtils.isPrime(23));


        System.out.println("Checking isSorted()");
        int[] testOne = {0};
        int[] testTwo = {0,1,3,5,7};
        int[] testThree = {2,6,9,11};
        int[] testFour = {9,2,5,7,2};
        int[] testFive = {1,1,2,2,4,4};
        int[] testSix = {1,3,5,7,9,2};



        System.out.println("Test One " + IntegerUtils.isSorted(testOne));
        System.out.println("Test Two " + IntegerUtils.isSorted(testTwo));
        System.out.println("Test Three " + IntegerUtils.isSorted(testThree));
        System.out.println("Test Four " + IntegerUtils.isSorted(testFour));
        System.out.println("Test Five " + IntegerUtils.isSorted(testFive));
        System.out.println("Test Six " + IntegerUtils.isSorted(testSix));


        System.out.println("Checking getMax() / getMin()");
        System.out.println("Max: " + IntegerUtils.getMaximum(intArray));
        System.out.println("Min: " + IntegerUtils.getMinimum(intArray));


        System.out.println("Checking getSmallestIndex()");
        System.out.println("Index: " + IntegerUtils.getSmallestIndexOfMatch(intArray,5));
        System.out.println("Index: " + IntegerUtils.getSmallestIndexOfMatch(intArray,19));

        System.out.println("Checking greatestCommonFactor()");
        System.out.println("GCF: " + IntegerUtils.greatestCommonFactor(-2,5));
        System.out.println("GCF: " + IntegerUtils.greatestCommonFactor(24,32));
        System.out.println("GCF: " + IntegerUtils.greatestCommonFactor(289,-17));
        System.out.println("GCF: " + IntegerUtils.greatestCommonFactor(30,42));
        System.out.println("GCF: " + IntegerUtils.greatestCommonFactor(-21,-21));

        System.out.println("Checking Greatest Constrained Multiple");
        System.out.println("Max: " + IntegerUtils.getGreatestConstrainedMultiple(7,50));
        System.out.println("Max: " + IntegerUtils.getGreatestConstrainedMultiple(2,100));
        System.out.println("Max: " + IntegerUtils.getGreatestConstrainedMultiple(3,19));
        System.out.println("Max: " + IntegerUtils.getGreatestConstrainedMultiple(10,789));
        System.out.println("Max: " + IntegerUtils.getGreatestConstrainedMultiple(-2,46));
        System.out.println("Max: " + IntegerUtils.getGreatestConstrainedMultiple(-52,5));


        System.out.println("Checking getIntegerH()");
        System.out.println("H: " + IntegerUtils.getIntegerH(7,3));
        System.out.println("H: " + IntegerUtils.getIntegerH(15,0));
    }
}
