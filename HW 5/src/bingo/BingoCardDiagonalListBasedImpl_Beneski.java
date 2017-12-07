package bingo;

public class BingoCardDiagonalListBasedImpl_Beneski extends BingoCardDiagonalListBased_Abstract
{
	//STUDENT: DO *NOT* ADD ANY INSTANCE VARIABLES HERE OR IN THE ABSTRACT CLASS!!!

	public BingoCardDiagonalListBasedImpl_Beneski(Mystery_D mystery)
	{
		super(mystery);
	}

	public BingoCardDiagonalListBasedImpl_Beneski(Integer [][] entries){

	}
	
	@Override
	public Integer getEntry(int row, int column)
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}

	@Override
	public void mark(int number)
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}

	@Override
	public boolean contains(int number)
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}

	@Override
	public boolean isMarked(int row, int column)
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}

	@Override
	public boolean isWinner()
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}

	@Override
	public String toString()
	{
		throw new RuntimeException("NOT IMPLEMENTED!");
	}
}