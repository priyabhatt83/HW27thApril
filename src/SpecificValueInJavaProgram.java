import java.util.Scanner;

public class SpecificValueInJavaProgram {

    public static void main(String[] args) {
// Write your code here
        int[] Array_numbers = {100, 200, 300, 500, 700, 800};

        boolean isPresent = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {

            if (Array_numbers[i] == x) {
                isPresent = true;

            }
        }
        if (isPresent == true){
            System.out.print("Good job");
        }
        else System.out.print("Error!");
    }
}