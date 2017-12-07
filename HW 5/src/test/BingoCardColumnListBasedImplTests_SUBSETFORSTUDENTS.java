package test;

import bingo.BingoCard;
import bingo.BingoCardColumnListBasedImpl_Beneski;
import bingo.BingoCardRowSetBasedImpl_Beneski;
import org.junit.Test;

import static org.junit.Assert.*;


public class BingoCardColumnListBasedImplTests_SUBSETFORSTUDENTS
{
	@Test
	public void testBingoCardConstructionZeroNonFSMarks()
	{
		Integer FS = BingoCard.FREE_SPACE;	//DEFINED PURELY SO THAT entries
											//ARRAY IS EASY TO READ:
		Integer[][] entries = new Integer[][]{
				  {  1, 16, 31, 46, 61},
				  {  4, 19, 34, 49, 64},
				  {  7, 22, FS, 52, 67},
				  { 10, 25, 40, 55, 70},
				  { 13, 28, 43, 58, 73}
				};
		
		BingoCard bingoCard = getBingoCard(entries);
		System.out.println("bingoCard = " + bingoCard);
		
		for(int i = 0; i < BingoCard.ROW_COUNT; i++)
		{
			for(int j = 0; j < BingoCard.COLUMN_COUNT; j++)
			{
				boolean isFreeSpaceLocation = (i == (BingoCard.FREE_SPACE_ROW - 1) && j == (BingoCard.FREE_SPACE_COLUMN - 1));
				Integer calculation = ((j)*(3)*BingoCard.ROW_COUNT) + (3*(i)) + 1;
				Integer expectedEntry = (!isFreeSpaceLocation ? calculation : BingoCard.FREE_SPACE);
				assertEquals(expectedEntry, bingoCard.getEntry(i + 1, j + 1));
			}
		}
		
		assertTrue(bingoCard.isMarked(BingoCard.FREE_SPACE_ROW, BingoCard.FREE_SPACE_COLUMN));
	}

	@Test
	public void testBingoCardConstructionZeroNonFSMarks2()
	{
		Integer FS = BingoCard.FREE_SPACE;	//DEFINED PURELY SO THAT entries
											//ARRAY IS EASY TO READ:
		Integer[][] entries = new Integer[][]{
		  {  2, 23, 45, 52, 74},
		  {  7, 25, 35, 50, 61},
		  { 12, 29, FS, 57, 67},
		  { 14, 27, 41, 53, 73},
		  { 13, 30, 34, 59, 75}
		};
		
		BingoCard bingoCard = getBingoCard(entries);
		System.out.println("bingoCard = " + bingoCard);
		
		for(int i = 0; i < BingoCard.ROW_COUNT; i++)
		{
			for(int j = 0; j < BingoCard.COLUMN_COUNT; j++)
			{
				Integer expectedEntry = entries[i][j];
				assertEquals(expectedEntry, bingoCard.getEntry(i + 1, j + 1));
			}
		}
		assertTrue(bingoCard.isMarked(BingoCard.FREE_SPACE_ROW, BingoCard.FREE_SPACE_COLUMN));
	}

	@Test
	public void testBingoCardConstructionAndWinner()
	{
		Integer FS = BingoCard.FREE_SPACE;	//DEFINED PURELY SO THAT entries
											//ARRAY IS EASY TO READ:
		Integer[][] entries = new Integer[][]{
		  {  2, 23, 45, 52, 74},
		  {  7, 25, 35, 50, 61},
		  { 12, 29, FS, 57, 67},
		  { 14, 27, 41, 53, 73},
		  { 13, 30, 34, 59, 75}
		};
		
		BingoCard bingoCard = getBingoCard(entries);
		System.out.println("bingoCard = " + bingoCard);
		
		for(int i = 0; i < BingoCard.ROW_COUNT; i++)
		{
			for(int j = 0; j < BingoCard.COLUMN_COUNT; j++)
			{
				Integer expectedEntry = entries[i][j];
				assertEquals(expectedEntry, bingoCard.getEntry(i + 1, j + 1));
				boolean isFreeSpaceLocation = (i == (BingoCard.FREE_SPACE_ROW - 1) && j == (BingoCard.FREE_SPACE_COLUMN - 1));
				if(!isFreeSpaceLocation)
				{
					assertFalse(bingoCard.isMarked(i + 1, j + 1));
				}
			}
		}
		assertTrue(bingoCard.isMarked(BingoCard.FREE_SPACE_ROW, BingoCard.FREE_SPACE_COLUMN));
		assertFalse(bingoCard.isWinner());

		bingoCard.mark(53);
		assertTrue(bingoCard.isMarked(4, 4));
		assertFalse(bingoCard.isWinner());
		
		bingoCard.mark(25);
		assertTrue(bingoCard.isMarked(2, 2));
		assertFalse(bingoCard.isWinner());
		
		bingoCard.mark(2);
		assertTrue(bingoCard.isMarked(1, 1));
		assertFalse(bingoCard.isWinner());
		
		bingoCard.mark(75);
		assertTrue(bingoCard.isMarked(5, 5));
		assertTrue(bingoCard.isWinner());
		
		for(int i = 0; i < BingoCard.ROW_COUNT; i++)
		{
			for(int j = 0; j < BingoCard.COLUMN_COUNT; j++)
			{
				boolean isDiagonalLocation = (i == j);
				if(!isDiagonalLocation)
				{
					assertFalse(bingoCard.isMarked(i + 1, j + 1));
				}
			}
		}
	}

	@Test(expected=AssertionError.class)
	public void testBingoCardConstructionFailureBadFreeSpaceLocation()
	{
		Integer FS = BingoCard.FREE_SPACE;	//DEFINED PURELY SO THAT entries
											//ARRAY IS EASY TO READ:
		Integer[][] entries = new Integer[][]{
		  { FS, 23, 45, 52, 74},
		  {  7, 25, 35, 50, 61},
		  { 12, 29, 38, 57, 67},
		  { 14, 27, 41, 53, 73},
		  { 13, 30, 34, 59, 75}
		};
		
		BingoCard bingoCard = getBingoCard(entries);
		System.out.println("bingoCard = " + bingoCard);
	}

	@Test(expected=AssertionError.class)
	public void testBingoCardConstructionFailureNotAllNumbersRespectColumnConstraints()
	{
		Integer FS = BingoCard.FREE_SPACE;	//DEFINED PURELY SO THAT entries
											//ARRAY IS EASY TO READ:
		Integer[][] entries = new Integer[][]{
		  { 75, 59, 34, 59, 75},
		  { 73, 53, 41, 53, 73},
		  { 67, 57, FS, 57, 67},
		  { 61, 50, 35, 50, 61},
		  { 74, 52, 45, 52, 74}
		};
		
		BingoCard bingoCard = getBingoCard(entries);
		System.out.println("bingoCard = " + bingoCard);
	}

	@Test(expected=AssertionError.class)
	public void testBingoCardConstructionFailureDuplicates()
	{
		Integer FS = BingoCard.FREE_SPACE;	//DEFINED PURELY SO THAT entries
											//ARRAY IS EASY TO READ:
		Integer[][] entries = new Integer[][]{
		  { 15, 30, 45, 60, 75},
		  { 15, 30, 45, 60, 75},
		  { 15, 30, FS, 60, 75},
		  { 15, 30, 45, 60, 75},
		  { 15, 30, 45, 60, 75}
		};
		
		BingoCard bingoCard = getBingoCard(entries);
		System.out.println("bingoCard = " + bingoCard);
	}
	
	//***********************************************************************
	//IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//STUDENT NEEDS TO REALIZE THAT THE STRUCTURE OF int[][] entries
	//HAS NO BEARING AT ALL ON THEIR IMPL's INTERNAL REPRESENTATION!!!!!!!!!!
	//***********************************************************************
	private static BingoCard getBingoCard(Integer[][] entries)
	{
		assert entries != null : "entries is null!";
		assert entries.length == BingoCard.ROW_COUNT : "entries.length = " + entries.length + " <> " + BingoCard.ROW_COUNT + " = BingoCard.ROW_COUNT!";
		final int ROW_INDEX_CENTER = (BingoCard.ROW_COUNT - 1)/2;
		final int COLUMN_INDEX_CENTER = (BingoCard.COLUMN_COUNT - 1)/2;
		assert entries[ROW_INDEX_CENTER][COLUMN_INDEX_CENTER] == BingoCard.FREE_SPACE : "entries[" + ROW_INDEX_CENTER + "][" + COLUMN_INDEX_CENTER + "] <> " + BingoCard.FREE_SPACE  + " = BingoCard.FREE_SPACE!";
		
		for(int i = 0; i < entries.length; i++)
		{
			Integer[] row_i_entries = entries[i];
			assert row_i_entries.length == BingoCard.COLUMN_COUNT : "row_i_entries.length = " + row_i_entries.length + " <> " + BingoCard.COLUMN_COUNT + " = BingoCard.COLUMN_COUNT!";
		}
		
		//Student can write code to translate int[][] entries to a representative that is appropriate for one of their constructors
		//Student should now make a constructor call and return the new instance




		return new BingoCardColumnListBasedImpl_Beneski(entries);
		//Student can call any constructor that they want here:
	}
}
