//write a program to enter any string and find number of 'a' in string

import java.util.Scanner;

public class Count_A_In_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");

        String str = sc.nextLine();
        System.out.print("Number of 'a' in String : " +countNumberOf_a_InString(str));

    }
public static int countNumberOf_a_InString(String str){

        int count = 0;
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)=='a'){
                count++;
            }
        }
    return count;
}
}
