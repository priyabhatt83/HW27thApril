//write a javaprogram to find equality of two Arrays

import java.util.Arrays;

public class TestEqualityOfTwoArrays {
    public static void main(String[] args) {

        String array_1[] = {"aaa","bbb","ccc","ddd","eee"};
        String array_2[] = {"aaa","bbb","ccc","ddd","eee"};
        String array_3[] = {"aaa","bdd","fff","ggg","hhh"};

        System.out.println("is array_1 equals to array_2 : " +
                Arrays.equals(array_1, array_2));
        System.out.println("is array_1 equals to array_3 : " +
                Arrays.equals(array_1, array_3));
    }
}

