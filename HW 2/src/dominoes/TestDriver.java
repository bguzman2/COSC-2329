package dominoes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jacobbeneski on 10/2/17.
 */
public class TestDriver {

    public static void main(String[] args){

        //1
        Domino dominoHighLow = new DominoHighLowImpl(4,3);


        //2
        Domino dominoString = new DominoHighLowImpl("4:2");
        System.out.println(dominoString.getHighPipCount());
        System.out.println(dominoString.getLowPipCount());


        //System.out.println(dominoString.isHighLowString("0:0"));
        //System.out.println(dominoString.isHighLowString("6:6"));

        //3
        Set<Integer> highLowSet = new HashSet<Integer>();
        highLowSet.add(5);
        highLowSet.add(5);
        Domino dominoSetImpl = new DominoHighLowImpl(highLowSet);
        System.out.println(dominoSetImpl.getLowPipCount());
        System.out.println(dominoSetImpl.getHighPipCount());

        Set<Integer> highLowSetTwo = new HashSet<Integer>();
        highLowSetTwo.add(6);
        highLowSetTwo.add(1);
        Domino dominoSetImplTwo = new DominoHighLowImpl(highLowSetTwo);
        System.out.println(dominoSetImplTwo.getHighPipCount());
        System.out.println(dominoSetImplTwo.getLowPipCount());


        //4

        int[] array = {12,0};
        int[] arrayTwo = {3,1};
        Domino dominoSumDifferenceImpl = new DominoHighLowImpl(array);

        System.out.println(dominoSumDifferenceImpl.getHighPipCount());
        System.out.println(dominoSumDifferenceImpl.getLowPipCount());

        Domino dominoSumDifferenceImplTwo = new DominoHighLowImpl(arrayTwo);
        System.out.println(dominoSumDifferenceImplTwo.getHighPipCount());
        System.out.println(dominoSumDifferenceImplTwo.getLowPipCount());





        //5



        Domino dominoSumDifferenceSetImpl = new DominoHighLowSetImpl(6, 3);
        System.out.println(dominoSumDifferenceSetImpl.getHighPipCount());
        System.out.println(dominoSumDifferenceSetImpl.getLowPipCount());


        //6

        Domino dominoSumDifference8PlusImpl = new DominoHighLowSetImpl(43);
        System.out.println(dominoSumDifference8PlusImpl.getHighPipCount());
        System.out.println(dominoSumDifference8PlusImpl.getLowPipCount());


        //7

        Domino dominoLowDifferenceStringImpl = new DominoLowDifferenceStringImpl(43);
        System.out.println(dominoLowDifferenceStringImpl.getHighPipCount());
        System.out.println(dominoLowDifferenceStringImpl.getLowPipCount());




    }



}
