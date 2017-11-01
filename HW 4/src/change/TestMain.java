package change;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestMain {


    public static void main(String [] args){
        Integer[] values = {1,5,10,25,100};

        Set<Integer> stuffSet = new HashSet<Integer>(Arrays.asList(values));

        ChangeMaker changeMaker = new ChangeMakerImpl_Beneski(stuffSet);

        System.out.println(changeMaker.getDenominations());

        System.out.println(changeMaker.toString());

    }

}
