package change;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ChangeMakerImpl_Beneski implements ChangeMaker {
    private List<Integer> denominationList;

    //part of pre: i <= 0 ==> !denominations.contains(i)
    //Student should figure out other parts of the precondition
    public ChangeMakerImpl_Beneski(Set<Integer> denominations) {
        assert !denominations.contains(null) : "Denomination List Can't Contain Null";


        denominationList = new ArrayList<>();

        denominationList.addAll(denominations);

        //Ensure the values are sorted greatest to least.
        Collections.sort(denominationList);
        Collections.reverse(denominationList);
    }

    public List<Integer> getDenominations() {
        return denominationList;
    }

    //Takes an int, and returns if the current denominations can be used to make exact change.
    //No Preconditions
    public boolean canMakeExactChange(int valueInCents) {

        boolean ableToMakeExactChange = false;

        int tempValue = valueInCents;

        //For every coin value, chack if it is divisible into the value.
        for (int coinValue : denominationList) {

            int numTimes = (tempValue / coinValue);

            tempValue = tempValue - coinValue * numTimes;

        }

        //If all the coins are divisible, and there is no remaining value, we can make change.
        if (tempValue == 0) {
            ableToMakeExactChange = true;
        }

        return ableToMakeExactChange;


    }

    public int calculateValueOfChangeList(List<Integer> changeList) {
        assert denominationList.size() == changeList.size() : "Change List Needs to Have the Same Size as Denomination List";
        assert !changeList.contains(null) : "Change List can't contain null";
        int returnValue = 0;

        //For every coin denomination multiply by the number of coins, and add to the value.
        for (int i = 0; i < denominationList.size(); i++) {

            returnValue += (denominationList.get(i)) * changeList.get(i);

        }

        return returnValue;

    }

    public List<Integer> getExactChange(int valueInCents) {

        List<Integer> returnList = new ArrayList<>();

        //The remainder
        int tempValue = valueInCents;

        //For every coin value, divide the temporary value by the value, and subtract.

        for (int coinValue : denominationList) {

            int numTimes = (tempValue / coinValue);

            tempValue = tempValue - coinValue * numTimes;

            //Add the number of coins.
            returnList.add(numTimes);

        }

        return returnList;
    }

    public String toString() {
        return denominationList.toString();
    }
}
