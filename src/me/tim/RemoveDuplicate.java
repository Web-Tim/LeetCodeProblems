package me.tim;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1245, 613, 61612, 1245};
        System.out.println(Arrays.toString(removeDuplicate(array)));
    }

    //TODO: Handle multiple duplicates.
    private static Object[] removeDuplicate(Object[] array) {
        Object lastObj = null, obj = array[0];
        int count = 0;
        while (lastObj != obj) {
            for (Object o : array) {
                obj = o;
            }
            count++;
            lastObj = array[count];
        }
        array[count] = null;
        return array;
    }
}
