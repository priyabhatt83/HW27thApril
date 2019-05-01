//write a program to enter string and find total number of words and total
// number of spaces in sentance.

import java.util.Scanner;

public class TotalWordsAndSpacesInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your sentence here : ");
        String str = sc.nextLine();


        int word = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                word++;
            }
        }
            System.out.println("Number of words : "+word);
            System.out.println("Number of spaces : "+(word-1));
        }
    }






