package bingo;

import java.util.*;

public class BingoCardRowSetBasedImpl_Beneski extends BingoCardRowSetBased_Abstract
{
	//STUDENT: DO *NOT* ADD ANY INSTANCE VARIABLES HERE OR IN THE ABSTRACT CLASS!!!

	public BingoCardRowSetBasedImpl_Beneski(Mystery_A mystery)
	{
		super(mystery);
	}

	public BingoCardRowSetBasedImpl_Beneski(Integer [][] entries){

		List<Set<Integer>> rowList = new ArrayList<>();

		for (Integer[] row: entries) {
			Set<Integer> rowSet = new HashSet<>();
			assert rowSet.size() == ROW_COUNT;
			for (Integer column: row) {
				rowSet.add(column);
			}

			rowList.add(rowSet);
		}
		rowSetList = rowList;
		integersMarked = new HashSet<>();
		integersMarked.add(FREE_SPACE);
	}

	
	@Override
	public Integer getEntry(int row, int column) {

		Set<Integer> rowSet = rowSetList.get(row-1);

		List<Integer> rowList = new ArrayList<>(rowSet);

		if(rowList.contains(null)){
			rowList.remove(null);
			Collections.sort(rowList);
			rowList.add(2,null);
		} else {
			Collections.sort(rowList);
		}

		return rowList.get(column-1);
	}

	@Override
	public void mark(int number)
	{
		integersMarked.add(number);
	}

	@Override
	public boolean contains(int number)
	{
		Integer integerNumber = new Integer(number);
		boolean containsNumber = false;
		for(int i = 1; i <= ROW_COUNT; i++){
			for(int j = 1; j <= COLUMN_COUNT; j++){
				System.out.println(getEntry(i,j));

				if(getEntry(i,j) == integerNumber){
					containsNumber = true;
				}

			}
		}
		return containsNumber;
	}

	@Override
	public boolean isMarked(int row, int column)
	{
		return integersMarked.contains(getEntry(row,column));
	}

	@Override
	public boolean isWinner()
	{
		//Try each row for winner
		//Try each column for winner
		//Try back diag
		//Try forward diag

		boolean winningCard = false;

		//Check each row if it is a winner
		for(int row = 1; row <= ROW_COUNT; row++){
			int counter = 0;
			for(int col = 1; col <= COLUMN_COUNT; col++){
				if(integersMarked.contains(getEntry(row,col)))
					counter++;
			}
			if(counter == 5)
				winningCard = true;
		}

		int diagCounter = 0;
		for(int i = 1; i <= ROW_COUNT; i++){
			if(isMarked(i,i))
				diagCounter++;
		}




		return winningCard;


	}

	@Override
	public String toString()
	{
		String outputString = "";

		for(int i = 0; i < ROW_COUNT; i++){
			for(int j =0; j < COLUMN_COUNT; j++){

				System.out.println(i + " " + j);

				try {
					outputString += " " + getEntry(i+1,j+1);
				} catch (IndexOutOfBoundsException e){
					System.out.println(e);
				}






			}



		}

		return outputString;
	}
}