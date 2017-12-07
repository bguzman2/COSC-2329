package bingo;

import java.util.List;
import java.util.Set;

public abstract class BingoCardColumnListBased_Abstract implements BingoCard
{
	protected List<List<Integer>> columnListList;	//Includes FREE_SPACE
	protected Set<Integer> integersMarked;			//Includes FREE_SPACE
	
	protected BingoCardColumnListBased_Abstract(Mystery_C mystery)
	{
		//Students should *NOT* change one byte of this constructor
		//Students should *NOT* delete this constructor
		throw new RuntimeException("This constructor should not be called!");
	}
	
	protected BingoCardColumnListBased_Abstract()
	{
		//Subclasses that call this constructor *must*
		//set the instance variables such that the
		//internal representation is respected!
		
		//This is only here because Dr. Kart is being
		//weird and is not providing any useful constructors
		//at this level
		columnListList = null;
		integersMarked = null;
	}
}
