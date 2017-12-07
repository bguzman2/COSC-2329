package bingo;

import java.util.List;
import java.util.Set;

public abstract class BingoCardRowSetBased_Abstract implements BingoCard
{
	//Includes FREE_SPACE
	//Always true: rowSetList.get(0).size() == rowSetList.get(1).size() == rowSetList.get(2).size() == rowSetList.get(3).size() == rowSetList.get(4).size() == COLUMN_COUNT
	protected List<Set<Integer>> rowSetList;	

	//Includes FREE_SPACE
	//Always true: integersMarked.size() > 0
	protected Set<Integer> integersMarked;	
	
	protected BingoCardRowSetBased_Abstract(Mystery_A mystery)
	{
		//Students should *NOT* change one byte of this constructor
		//Students should *NOT* delete this constructor
		throw new RuntimeException("This constructor should not be called!");
	}
	
	protected BingoCardRowSetBased_Abstract()
	{
		//Subclasses that call this constructor *must*
		//set the instance variables such that the
		//internal representation is respected!
		
		//This is only here because Dr. Kart is being
		//weird and is not providing any useful constructors
		//at this level
		rowSetList = null;
		integersMarked = null;
	}
	
	public String toString()
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}
}