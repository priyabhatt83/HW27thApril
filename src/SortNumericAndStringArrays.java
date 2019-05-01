//Write a java program to sort numeric and string arrays.

import java.util.Arrays;

public class SortNumericAndStringArrays {


    public static void main(String[] args) {

        int[] my_arr1 = {1990, 1953,1943,2019,2012,1999,2000};

        String[] my_arr2 = {"Black","Red","Orange","Pink","White","Green","Yellow"};
        System.out.println("Original numeric array : " + Arrays.toString(my_arr1));
        Arrays.sort(my_arr1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_arr1));

        System.out.println("Original string array : " + Arrays.toString(my_arr2));
        Arrays.sort(my_arr2);
        System.out.println("Sorted string array : " + Arrays.toString(my_arr2));
    }
}