package change;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ChangeMakerImpl_Beneski implements ChangeMaker
{	
	private List<Integer> denominationList;
	
	//part of pre: i <= 0 ==> !denominations.contains(i)
	//Student should figure out other parts of the precondition
	public ChangeMakerImpl_Beneski(Set<Integer> denominations)
	{
		denominationList = new ArrayList<>();

		denominationList.addAll(denominations);

        Collections.sort(denominationList);
        Collections.reverse(denominationList);
	}
	
	public List<Integer> getDenominations()
	{
		return denominationList;
	}
	
	public boolean canMakeExactChange(int valueInCents)
	{

	    boolean ableToMakeExactChange = false;

	    int tempValue = valueInCents;

	    for(int coinValue : denominationList){

	        int numTimes = (tempValue / coinValue);

	        if(numTimes != 0){
	            tempValue = tempValue - coinValue * numTimes;
            }
        }

        if(tempValue == 0){
	        ableToMakeExactChange = true;
        }

		return ableToMakeExactChange;


	}
	
	public int calculateValueOfChangeList(List<Integer> changeList)
	{
	    assert denominationList.size() == changeList.size() : "Change List Needs to Have the Same Size as Denomination List";
	    int returnValue = 0;

	    for(int i = 0; i < denominationList.size(); i++){

	        returnValue += (denominationList.get(i)) * changeList.get(i);

        }

        return returnValue;

	}

	public List<Integer> getExactChange(int valueInCents)
	{
	    List<Integer> returnList = new ArrayList<>();

        int tempValue = valueInCents;

        for(int coinValue : denominationList){

            int numTimes = (tempValue / coinValue);

            tempValue = tempValue - coinValue * numTimes;

            returnList.add(numTimes);

        }

		return returnList;
	}
	
	public String toString()
	{
        return denominationList.toString();
	}
}
