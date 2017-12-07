package bingo;

public interface BingoCard {
	public static final int ROW_COUNT = 5;
	public static final int COLUMN_COUNT = 5;
	public static final int FREE_SPACE_ROW = 3;
	public static final int FREE_SPACE_COLUMN = 3;
	public static final Integer FREE_SPACE = null;
	
	//part of pre: 1 <= row <= ROW_COUNT
	//part of pre: 1 <= column <= COLUMN_COUNT
	//part of post: column == 1 ("B") ==> 1 <= rv <= 15
	//part of post: column == 2 ("I") ==> 16 <= rv <= 30
	//part of post: column == 3 ("N") ==> ((31 <= rv <= 45) || ((row = 3) && (rv == FREE_SPACE)));
	//part of post: column == 4 ("G") ==> 46 <= rv <= 60
	//part of post: column == 5 ("O") ==> 61 <= rv <= 75
	//part of post: ((column - 1)*15 + 1) <= rv <= ((column - 1) + 1)*15
	//part of post: rv == FREE_SPACE <==> ((row == FREE_SPACE_ROW) && (column == FREE_SPACE_COLUMN))
	public Integer getEntry(int row, int column);
	
	//part of pre: 1 <= number <= 75
	//part of post: contains(number) <==> (isMarked(row, column) for some 1 <= row <= ROW_COUNT, 1 <= column <= COLUMN_COUNT)
	public void mark(int number);
	
	//pre: true
	//part of post: rv == ((getEntry(1, 1) == number) || (getEntry(1, 2) == number) || ... || (getEntry(1, COLUMN_COUNT) == number) ||
	//					   (getEntry(2, 1) == number) || (getEntry(2, 2) == number) || ... || (getEntry(2, COLUMN_COUNT) == number) ||
	//					   (getEntry(ROW_COUNT, 1) == number) || (getEntry(ROW_COUNT, 2) == number) || ... || (getEntry(ROW_COUNT, COLUMN_COUNT) == number))
	public boolean contains(int number);
	
	//part of pre: 1 <= row <= ROW_COUNT
	//part of pre: 1 <= column <= COLUMN_COUNT
	public boolean isMarked(int row, int column);
	
	//pre: true
	//post: left to student
	public boolean isWinner();
}