//Write a java program to sum values of Arrays.

public class SumOfValueOfArrays {

    public static void main(String[] args) {
        int my_array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
