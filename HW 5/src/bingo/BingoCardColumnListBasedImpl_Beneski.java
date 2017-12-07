package bingo;

public class BingoCardColumnListBasedImpl_Beneski extends BingoCardColumnListBased_Abstract
{
	//STUDENT: DO *NOT* ADD ANY INSTANCE VARIABLES HERE OR IN THE ABSTRACT CLASS!!!

	public BingoCardColumnListBasedImpl_Beneski(Mystery_C mystery)
	{
		super(mystery);
	}

	public BingoCardColumnListBasedImpl_Beneski(Integer [][] entries){



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