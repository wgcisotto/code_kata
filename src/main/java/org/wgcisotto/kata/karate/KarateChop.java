package org.wgcisotto.kata.karate;

public class KarateChop {

    /**
     * Personal note;
     * my error here was that I first tried to iterate until the i <= array.length this cause me an index out of bound
     * because array.length -1 is the last position when the array is not empty of course. :)
     **/
    public static int chop(int target, int[] array){
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) position = i;
        }
        return position;
    }

}
