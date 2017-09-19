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





        //System.out.print(IntegerUtils.getMaximum(intArray));
    }
}
