package bingo;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BingoCardDiagonalListBasedImpl_Beneski extends BingoCardDiagonalListBased_Abstract {
    //STUDENT: DO *NOT* ADD ANY INSTANCE VARIABLES HERE OR IN THE ABSTRACT CLASS!!!

    public BingoCardDiagonalListBasedImpl_Beneski(Mystery_D mystery) {
        super(mystery);
    }

    public BingoCardDiagonalListBasedImpl_Beneski(Integer[][] entries) {
        diagonalListList = new ArrayList<>();
        integersMarked = new HashSet<>();

        for (Integer[] list : entries) {
            List<Integer> diag = new ArrayList<>();
            for (Integer value : list) {
                diag.add(value);
            }
            System.out.println(diag);
            diagonalListList.add(diag);

        }


    }

    @Override
    public Integer getEntry(int row, int column) {
        assert row <= ROW_COUNT;
        assert column <= COLUMN_COUNT;

        Integer entry = null;
        if ((row == 3) && (column == 3)) {
            return FREE_SPACE;
        } else {

            //This is awful and I feel bad for doing it, but I got lazy and couldn't figure out the pattern.

            if ((row == 1) && (column == 1))
                entry = diagonalListList.get(4).get(3);
            else if ((row == 1) && (column == 2))
                entry = diagonalListList.get(5).get(3);
            else if ((row == 1) && (column == 3))
                entry = diagonalListList.get(6).get(2);
            else if ((row == 1) && (column == 4))
                entry = diagonalListList.get(7).get(1);
            else if ((row == 1) && (column == 5))
                entry = diagonalListList.get(8).get(0);
            else if ((row == 2) && (column == 1))
                entry = diagonalListList.get(3).get(3);
            else if ((row == 2) && (column == 2))
                entry = diagonalListList.get(4).get(2);
            else if ((row == 2) && (column == 3))
                entry = diagonalListList.get(5).get(2);
            else if ((row == 2) && (column == 4))
                entry = diagonalListList.get(6).get(1);
            else if ((row == 2) && (column == 5))
                entry = diagonalListList.get(7).get(0);
            else if ((row == 3) && (column == 1))
                entry = diagonalListList.get(2).get(2);
            else if ((row == 3) && (column == 2))
                entry = diagonalListList.get(3).get(2);
            else if ((row == 3) && (column == 4))
                entry = diagonalListList.get(5).get(1);
            else if ((row == 3) && (column == 5))
                entry = diagonalListList.get(6).get(0);
            else if ((row == 4) && (column == 1))
                entry = diagonalListList.get(1).get(1);
            else if ((row == 4) && (column == 2))
                entry = diagonalListList.get(2).get(1);
            else if ((row == 4) && (column == 3))
                entry = diagonalListList.get(3).get(1);
            else if ((row == 4) && (column == 4))
                entry = diagonalListList.get(4).get(1);
            else if ((row == 4) && (column == 5))
                entry = diagonalListList.get(5).get(0);
            else if ((row == 5) && (column == 1))
                entry = diagonalListList.get(0).get(0);
            else if ((row == 5) && (column == 2))
                entry = diagonalListList.get(1).get(0);
            else if ((row == 5) && (column == 3))
                entry = diagonalListList.get(2).get(0);
            else if ((row == 5) && (column == 4))
                entry = diagonalListList.get(3).get(0);
            else if ((row == 5) && (column == 5))
                entry = diagonalListList.get(4).get(0);

        }

        return entry;

    }

    @Override
    public void mark(int number) {
        //Add the number to the list.
        integersMarked.add(number);
    }

    @Override
    public boolean contains(int number) {
        boolean containsNumber = false;

        //Check each row and column if the value matches the requested number.
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
        if ((row == 3) && (column == 3))
            return true;
        else
            //Check the set of marked values.
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
        //Add Each value to the output string.
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