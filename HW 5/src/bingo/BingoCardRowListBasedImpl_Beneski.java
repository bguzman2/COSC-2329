package bingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BingoCardRowListBasedImpl_Beneski extends BingoCardRowListBased_Abstract {
    //STUDENT: DO *NOT* ADD ANY INSTANCE VARIABLES HERE OR IN THE ABSTRACT CLASS!!!

    public BingoCardRowListBasedImpl_Beneski(Mystery_B mystery) {
        super(mystery);
    }

    public BingoCardRowListBasedImpl_Beneski(Integer[][] entries) {
        integersMarked = new HashSet<>();
        rowListList = new ArrayList<>();


        for (int i = 0; i < ROW_COUNT; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < COLUMN_COUNT; j++) {
                rowList.add(entries[i][j]);
            }
            rowListList.add(rowList);
        }
    }

    @Override
    public Integer getEntry(int row, int column) {
        List<Integer> rowList = rowListList.get(row - 1);

        if ((row == 3) && (column == 3))
            return FREE_SPACE;

        return rowList.get(column - 1);
    }

    @Override
    public void mark(int number) {
        integersMarked.add(number);
    }

    @Override
    public boolean contains(int number) {
        Integer integerNumber = new Integer(number);
        boolean containsNumber = false;
        for (int i = 1; i <= ROW_COUNT; i++) {
            for (int j = 1; j <= COLUMN_COUNT; j++) {
                System.out.println(getEntry(i, j));

                if (getEntry(i, j) == integerNumber) {
                    containsNumber = true;
                }

            }
        }
        return containsNumber;
    }

    @Override
    public boolean isMarked(int row, int column) {
        if ((row == 3) && (column == 3)) {
            return true;
        } else {
            return integersMarked.contains(getEntry(row, column));
        }
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
            for(int j = 1; j <= COLUMN_COUNT; j++){
                System.out.println("Checking Diag: " + i + " " + j);
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

                System.out.println(i + " " + j);

                try {
                    outputString += " " + getEntry(i + 1, j + 1);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
                }


            }


        }

        return outputString;
    }
}