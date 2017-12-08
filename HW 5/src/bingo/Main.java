package bingo;

public class Main {
    public static void main(String[] args){

        Integer FS = BingoCard.FREE_SPACE;

        Integer[][] entries = new Integer[][]{
                {  2, 23, 45, 52, 74},
                {  7, 25, 35, 50, 61},
                { 12, 29, FS, 57, 67},
                { 14, 27, 41, 53, 73},
                { 13, 30, 34, 59, 75}
        };

        BingoCard bingoCard = new BingoCardRowSetBasedImpl_Beneski(entries);

        System.out.println(bingoCard.contains(96));


    }

}
