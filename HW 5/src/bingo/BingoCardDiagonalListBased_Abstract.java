package bingo;

import java.util.List;
import java.util.Set;

public abstract class BingoCardDiagonalListBased_Abstract implements BingoCard
{
	//*DOES NOT* include FREE_SPACE
	protected List<List<Integer>> diagonalListList;
	//*DOES NOT* include FREE_SPACE
	protected Set<Integer> integersMarked;
	
	protected BingoCardDiagonalListBased_Abstract(Mystery_D mystery)
	{
		//Students should *NOT* change one byte of this constructor
		//Students should *NOT* delete this constructor
		throw new RuntimeException("This constructor should not be called!");
	}
	
	protected BingoCardDiagonalListBased_Abstract()
	{
		//Subclasses that call this constructor *must*
		//set the instance variables such that the
		//internal representation is respected!
		
		//This is only here because Dr. Kart is being
		//weird and is not providing any useful constructors
		//at this level
		diagonalListList = null;
		integersMarked = null;
	}
}
