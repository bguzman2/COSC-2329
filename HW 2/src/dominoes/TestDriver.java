package dominoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jacobbeneski on 10/2/17.
 */
public class TestDriver {

    public static void main(String[] args){

        //High Pip Count and Low Pip Count
        System.out.println("Test One");
        Domino dominoHighLow = new DominoHighLowImpl_Beneski(6,4);
        System.out.println("The Domino has value: " + dominoHighLow.getHighPipCount() + " " + dominoHighLow.getLowPipCount());
        Domino dominoHighLow1 = new DominoHighLowImpl_Beneski(5,2);
        System.out.println("The Domino has value: " + dominoHighLow1.getHighPipCount() + " " + dominoHighLow1.getLowPipCount());
        //Domino dominoHighLow2 = new DominoHighLowImpl_Beneski(8,0);
        //System.out.println("The Domino has value: " + dominoHighLow2.getHighPipCount() + " " + dominoHighLow.getLowPipCount());
        Domino dominoHighLow3 = new DominoHighLowImpl_Beneski(3,3);
        System.out.println("The Domino has value: " + dominoHighLow3.getHighPipCount() + " " + dominoHighLow3.getLowPipCount());
        Domino dominoHighLow4 = new DominoHighLowImpl_Beneski(3,6);
        System.out.println("The Domino has value: " + dominoHighLow4.getHighPipCount() + " " + dominoHighLow4.getLowPipCount());

        //HighLow Pip Count String
        System.out.println("Test Two");
        Domino dominoHighLowString = new DominoHighLowImpl_Beneski("6:4");
        System.out.println(dominoHighLowString.getHighPipCount() + " " + dominoHighLowString.getLowPipCount());
        Domino dominoHighLowString1 = new DominoHighLowImpl_Beneski("5:2");
        System.out.println(dominoHighLowString1.getHighPipCount() + " " + dominoHighLowString1.getLowPipCount());
        Domino dominoHighLowString2 = new DominoHighLowImpl_Beneski("2:4");
        System.out.println(dominoHighLowString2.getHighPipCount() + " " + dominoHighLowString2.getLowPipCount());
        Domino dominoHighLowString3 = new DominoHighLowImpl_Beneski("3:0");
        System.out.println(dominoHighLowString3.getHighPipCount() + " " + dominoHighLowString3.getLowPipCount());
        //Domino dominoHighLowString4 = new DominoHighLowImpl_Beneski("3|2");


        //int Sum Difference Array
        int [] array1 = {7,3};
        int [] array2 = {6,0};
        int [] array3 = {5,4};
        int [] array4 = {2,2};
        int [] array5 = {4,1};

        System.out.println("Test Three");
        Domino dominoSumDifference = new DominoHighLowImpl_Beneski(array1);
        System.out.println(dominoSumDifference.getHighPipCount() + " " + dominoSumDifference.getLowPipCount());
        Domino dominoSumDifference1 = new DominoHighLowImpl_Beneski(array2);
        System.out.println(dominoSumDifference1.getHighPipCount() + " " + dominoSumDifference1.getLowPipCount());
        Domino dominoSumDifference2 = new DominoHighLowImpl_Beneski(array3);
        System.out.println(dominoSumDifference2.getHighPipCount() + " " + dominoSumDifference2.getLowPipCount());
        Domino dominoSumDifference3 = new DominoHighLowImpl_Beneski(array4);
        System.out.println(dominoSumDifference3.getHighPipCount() + " " + dominoSumDifference3.getLowPipCount());
        Domino dominoSumDifference4 = new DominoHighLowImpl_Beneski(array5);
        System.out.println(dominoSumDifference4.getHighPipCount() + " " + dominoSumDifference4.getLowPipCount());


        Set<Integer> highLowSet = new HashSet<>(); highLowSet.add(2); highLowSet.add(3);
        Set<Integer> highLowSet1 = new HashSet<>(); highLowSet1.add(6);
        Set<Integer> highLowSet2 = new HashSet<>(); highLowSet2.add(6); highLowSet2.add(6);
        Set<Integer> highLowSet3 = new HashSet<>(); highLowSet3.add(5); highLowSet3.add(1);



        //High Low Set
        System.out.println("Test Four");
        Domino dominoHighLowSet = new DominoHighLowImpl_Beneski(highLowSet);
        System.out.println(dominoHighLowSet.getHighPipCount() + " " + dominoHighLowSet.getLowPipCount());
        Domino dominoHighLowSet1 = new DominoHighLowImpl_Beneski(highLowSet1);
        System.out.println(dominoHighLowSet1.getHighPipCount() + " " + dominoHighLowSet1.getLowPipCount());
        Domino dominoHighLowSet2 = new DominoHighLowImpl_Beneski(highLowSet2);
        System.out.println(dominoHighLowSet2.getHighPipCount() + " " + dominoHighLowSet2.getLowPipCount());
        Domino dominoHighLowSet3 = new DominoHighLowImpl_Beneski(highLowSet3);
        System.out.println(dominoHighLowSet3.getHighPipCount() + " " + dominoHighLowSet3.getLowPipCount());



        //High Pip Count, low pip count
        System.out.println("Test Five");
        Domino dominoHighPipLowPip = new DominoHighLowSetImpl_Beneski(6,5);
        System.out.println(dominoHighPipLowPip.getHighPipCount() + " " + dominoHighPipLowPip.getLowPipCount());
        Domino dominoHighPipLowPip1 = new DominoHighLowSetImpl_Beneski(3,3);
        System.out.println(dominoHighPipLowPip1.getHighPipCount() + " " + dominoHighPipLowPip1.getLowPipCount());
        Domino dominoHighPipLowPip2 = new DominoHighLowSetImpl_Beneski(2,5);
        System.out.println(dominoHighPipLowPip2.getHighPipCount() + " " + dominoHighPipLowPip2.getLowPipCount());
        Domino dominoHighPipLowPip3 = new DominoHighLowSetImpl_Beneski(1,2);
        System.out.println(dominoHighPipLowPip3.getHighPipCount() + " " + dominoHighPipLowPip3.getLowPipCount());
        Domino dominoHighPipLowPip4 = new DominoHighLowSetImpl_Beneski(0,4);
        System.out.println(dominoHighPipLowPip4.getHighPipCount() + " " + dominoHighPipLowPip4.getLowPipCount());


        //Sum Difference String
        System.out.println("Test Six");
        Domino dominoSumDifferenceString = new DominoHighLowSetImpl_Beneski("7,3");
        System.out.println(dominoSumDifferenceString.getHighPipCount() + " " + dominoSumDifferenceString.getLowPipCount());
        Domino dominoSumDifferenceString1 = new DominoHighLowSetImpl_Beneski("6,0");
        System.out.println(dominoSumDifferenceString1.getHighPipCount() + " " + dominoSumDifferenceString1.getLowPipCount());
        Domino dominoSumDifferenceString2 = new DominoHighLowSetImpl_Beneski("5,4");
        System.out.println(dominoSumDifferenceString2.getHighPipCount() + " " + dominoSumDifferenceString2.getLowPipCount());
        Domino dominoSumDifferenceString3 = new DominoHighLowSetImpl_Beneski("2,2");
        System.out.println(dominoSumDifferenceString3.getHighPipCount() + " " + dominoSumDifferenceString3.getLowPipCount());
        Domino dominoSumDifferenceString4 = new DominoHighLowSetImpl_Beneski("4,1");
        System.out.println(dominoSumDifferenceString4.getHighPipCount() + " " + dominoSumDifferenceString4.getLowPipCount());

        //Low Plus 8 Times High
        System.out.println("Test Seven");
        Domino dominoLowPlus8TimesHigh = new DominoHighLowSetImpl_Beneski(43);
        System.out.println(dominoLowPlus8TimesHigh.getHighPipCount() + " " + dominoLowPlus8TimesHigh.getLowPipCount());
        Domino dominoLowPlus8TimesHigh1 = new DominoHighLowSetImpl_Beneski(16);
        System.out.println(dominoLowPlus8TimesHigh1.getHighPipCount() + " " + dominoLowPlus8TimesHigh1.getLowPipCount());
        Domino dominoLowPlus8TimesHigh2 = new DominoHighLowSetImpl_Beneski(36);
        System.out.println(dominoLowPlus8TimesHigh2.getHighPipCount() + " " + dominoLowPlus8TimesHigh2.getLowPipCount());
        Domino dominoLowPlus8TimesHigh3 = new DominoHighLowSetImpl_Beneski(51);
        System.out.println(dominoLowPlus8TimesHigh3.getHighPipCount() + " " + dominoLowPlus8TimesHigh3.getLowPipCount());
        Domino dominoLowPlus8TimesHigh4 = new DominoHighLowSetImpl_Beneski(23);
        System.out.println(dominoLowPlus8TimesHigh4.getHighPipCount() + " " + dominoLowPlus8TimesHigh4.getLowPipCount());

        //Low plus 8 times high string
        System.out.println("Test Eight");
        Domino dominoLowPlus8TimesHighString = new DominoLowDifferenceStringImpl_Beneski(43);
        System.out.println(dominoLowPlus8TimesHighString.getHighPipCount() + " " + dominoLowPlus8TimesHighString.getLowPipCount());
        Domino dominoLowPlus8TimesHighString1 = new DominoLowDifferenceStringImpl_Beneski(16);
        System.out.println(dominoLowPlus8TimesHighString1.getHighPipCount() + " " + dominoLowPlus8TimesHighString1.getLowPipCount());
        Domino dominoLowPlus8TimesHighString2 = new DominoLowDifferenceStringImpl_Beneski(36);
        System.out.println(dominoLowPlus8TimesHighString2.getHighPipCount() + " " + dominoLowPlus8TimesHighString2.getLowPipCount());
        Domino dominoLowPlus8TimesHighString3 = new DominoLowDifferenceStringImpl_Beneski(51);
        System.out.println(dominoLowPlus8TimesHighString3.getHighPipCount() + " " + dominoLowPlus8TimesHighString3.getLowPipCount());
        Domino dominoLowPlus8TimesHighString4 = new DominoLowDifferenceStringImpl_Beneski(23);
        System.out.println(dominoLowPlus8TimesHighString4.getHighPipCount() + " " + dominoLowPlus8TimesHighString4.getLowPipCount());

        //High Sum List
        List<Integer> listOne = new ArrayList<>(); listOne.add(5); listOne.add(7);
        List<Integer> listTwo = new ArrayList<>(); listTwo.add(1); listTwo.add(3);
        List<Integer> listThree = new ArrayList<>(); listThree.add(3); listThree.add(5);
        List<Integer> listFour = new ArrayList<>(); listFour.add(6); listFour.add(4);
        List<Integer> listFive = new ArrayList<>(); listFive.add(4); listFive.add(4);




        //Test Nine
        Domino dominoHighSum = new DominoLowDifferenceStringImpl_Beneski(listOne);
        Domino dominoHighSum1 = new DominoLowDifferenceStringImpl_Beneski(listTwo);
        Domino dominoHighSum2 = new DominoLowDifferenceStringImpl_Beneski(listThree);
        Domino dominoHighSum3 = new DominoLowDifferenceStringImpl_Beneski(listFour);
        Domino dominoHighSum4 = new DominoLowDifferenceStringImpl_Beneski(listFive);




        /*




        //1
        Domino dominoHighLow = new DominoHighLowImpl_Beneski(6,4);


        //2
        Domino dominoString = new DominoHighLowImpl_Beneski("4:2");
        System.out.println(dominoString.getHighPipCount());
        System.out.println(dominoString.getLowPipCount());


        //System.out.println(dominoString.isHighLowString("0:0"));
        //System.out.println(dominoString.isHighLowString("6:6"));

        //3
        Set<Integer> highLowSet = new HashSet<Integer>();
        highLowSet.add(5);
        highLowSet.add(5);
        Domino dominoSetImpl = new DominoHighLowImpl_Beneski(highLowSet);
        System.out.println(dominoSetImpl.getLowPipCount());
        System.out.println(dominoSetImpl.getHighPipCount());

        Set<Integer> highLowSetTwo = new HashSet<Integer>();
        highLowSetTwo.add(6);
        highLowSetTwo.add(1);
        Domino dominoSetImplTwo = new DominoHighLowImpl_Beneski(highLowSetTwo);
        System.out.println(dominoSetImplTwo.getHighPipCount());
        System.out.println(dominoSetImplTwo.getLowPipCount());


        //4

        int[] array = {12,0};
        int[] arrayTwo = {3,1};
        Domino dominoSumDifferenceImpl = new DominoHighLowImpl_Beneski(array);

        System.out.println(dominoSumDifferenceImpl.getHighPipCount());
        System.out.println(dominoSumDifferenceImpl.getLowPipCount());

        Domino dominoSumDifferenceImplTwo = new DominoHighLowImpl_Beneski(arrayTwo);
        System.out.println(dominoSumDifferenceImplTwo.getHighPipCount());
        System.out.println(dominoSumDifferenceImplTwo.getLowPipCount());





        //5



        Domino dominoSumDifferenceSetImpl = new DominoHighLowSetImpl_Beneski(6, 3);
        System.out.println(dominoSumDifferenceSetImpl.getHighPipCount());
        System.out.println(dominoSumDifferenceSetImpl.getLowPipCount());


        //6

        Domino dominoSumDifference8PlusImpl = new DominoHighLowSetImpl_Beneski(43);
        System.out.println(dominoSumDifference8PlusImpl.getHighPipCount());
        System.out.println(dominoSumDifference8PlusImpl.getLowPipCount());


        //7

        Domino dominoLowDifferenceStringImpl = new DominoLowDifferenceStringImpl_Beneski(43);
        System.out.println(dominoLowDifferenceStringImpl.getHighPipCount());
        System.out.println(dominoLowDifferenceStringImpl.getLowPipCount());


*/

    }



}
