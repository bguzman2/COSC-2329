package bingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BingoCardColumnListBasedImpl_Beneski extends BingoCardColumnListBased_Abstract {
    //STUDENT: DO *NOT* ADD ANY INSTANCE VARIABLES HERE OR IN THE ABSTRACT CLASS!!!

    public BingoCardColumnListBasedImpl_Beneski(Mystery_C mystery) {
        super(mystery);
    }

    public BingoCardColumnListBasedImpl_Beneski(Integer[][] entries) {

        columnListList = new ArrayList<>();

        for (int column = 0; column < COLUMN_COUNT; column++) {
            List<Integer> columnList = new ArrayList<>();
            for (int row = 0; row < ROW_COUNT; row++) {
                columnList.add(entries[row][column]);
            }

            columnListList.add(columnList);

        }


        integersMarked = new HashSet<>();
        integersMarked.add(FREE_SPACE);


        System.out.println(columnListList);


    }

    @Override
    public Integer getEntry(int row, int column) {
        assert row <= ROW_COUNT;
        assert column <= COLUMN_COUNT;
        List<Integer> columnList = columnListList.get(column - 1);

        if ((row == 3) && (column == 3))
            return FREE_SPACE;
        else
            return columnList.get(row - 1);
    }

    @Override
    public void mark(int number) {
        integersMarked.add(number);
    }

    @Override
    public boolean contains(int number) {
        boolean containsNumber = false;

        for (int i = 1; i <= ROW_COUNT; i++) {
            for (int j = 1; j <= COLUMN_COUNT; j++) {
                System.out.println(getEntry(i, j));

                if ((i == 3) && (j == 3))
                    continue;
                else if (getEntry(i, j) == number) {
                    containsNumber = true;
                }

            }
        }
        return containsNumber;
    }

    @Override
    public boolean isMarked(int row, int column) {
        return integersMarked.contains(getEntry(row, column));
    }

    @Override
    public boolean isWinner() {
        //Try each row for winner
        //Try each column for winner
        //Try back diag
        //Try forward diag

        boolean winningCard = false;

        //Check each row if it is a winner
        for (int row = 1; row <= ROW_COUNT; row++) {
            int counter = 0;
            for (int col = 1; col <= COLUMN_COUNT; col++) {
                if (integersMarked.contains(getEntry(row, col)))
                    counter++;
            }
            if (counter == 5)
                winningCard = true;
        }

        int diagCounterOne = 0;
        for (int i = 1; i <= ROW_COUNT; i++) {
            if (isMarked(i, i))
                diagCounterOne++;
        }


        if (diagCounterOne == 5)
            winningCard = true;

        int diagCounterTwo = 0;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= COLUMN_COUNT; j++) {
                if (isMarked(i, j))
                    diagCounterTwo++;
            }

        }


        if (diagCounterTwo == 5)
            winningCard = true;


        return winningCard;
    }

    @Override
    public String toString() {
        String outputString = "";

        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {

                try {
                    Integer entry = getEntry(i + 1, j + 1);
                    if (entry == null)
                        outputString += " FS";
                    else
                        outputString += " " + entry;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            }
            outputString += "\n";
        }
        return outputString;
    }
}