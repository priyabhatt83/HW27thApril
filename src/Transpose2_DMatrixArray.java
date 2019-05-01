//write a java program to transpose 2-D matrix array

import java.util.Scanner;

public class Transpose2_DMatrixArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[10][10];
        System.out.println("Enter the Matrix rows and columns : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter matrix elemets : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int transpose[][] = new int[10][10];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of given matrix is : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d\t",transpose[i][j]);
            }
            System.out.println( "  ");
        }
    }
}