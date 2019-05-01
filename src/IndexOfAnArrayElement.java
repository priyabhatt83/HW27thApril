//write a java program to find the index of an array element.

import java.util.Scanner;

public class IndexOfAnArrayElement {

    public static void main(String[] args) {
        int index = 0;
        boolean isPresent = false;
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Value : ");
        int input = scanner.nextInt();

        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == input) {
                isPresent = true;
                index = i;
            }}
        if (isPresent==true){

            System.out.println("Element is present in array at index =" +index);
        }else{
            System.out.println("Element is not present in array");
        }
    }}

