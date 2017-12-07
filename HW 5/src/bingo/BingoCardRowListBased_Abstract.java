package bingo;

import java.util.List;
import java.util.Set;

public abstract class BingoCardRowListBased_Abstract implements BingoCard
{
	//*DOES NOT* include FREE_SPACE
	//Always true: rowSetList.get(0).size() == rowSetList.get(1).size() == rowSetList.get(3).size() == rowSetList.get(4).size() == COLUMN_COUNT
	//Always true: rowSetList.get(2).size() == (COLUMN_COUNT - 1)
	//Always true: !rowSetList.contains(FREE_SPACE)
	protected List<List<Integer>> rowListList;

	//*DOES NOT* include FREE_SPACE
	//Always true: !integersMarked.contains(FREE_SPACE)
	protected Set<Integer> integersMarked;
	
	protected BingoCardRowListBased_Abstract(Mystery_B mystery)
	{
		//Students should *NOT* change one byte of this constructor
		//Students should *NOT* delete this constructor
		throw new RuntimeException("This constructor should not be called!");
	}
	
	protected BingoCardRowListBased_Abstract()
	{
		//Subclasses that call this constructor *must*
		//set the instance variables such that the
		//internal representation is respected!
		
		//This is only here because Dr. Kart is being
		//weird and is not providing any useful constructors
		//at this level
		rowListList = null;
		integersMarked = null;
	}
}