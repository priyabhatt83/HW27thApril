//write a java program to reverse an array of integer value

import java.util.Scanner;

public class ReverseAnArrayOfIntegerValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the Element : " );
        //capturing the number of the element in to array
        int num = scanner.nextInt();
        //create an array with size num
        int a[] = new int[num];
        //read the element into the array
        System.out.println("Enter the element into the array : ");

        for (int i =0; i<num;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println("Printing the reverse element in the array : ");

        for (int i = a.length-1;i>=0;i--){

            System.out.println(a[i]);
        }
    }

    
}
