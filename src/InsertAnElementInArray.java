//write a java program to insert an element in Array

public class InsertAnElementInArray {

    public static void main(String[] args) {

        int my_Array[] = {1,2,3,4,5,6,7,8,9,10};
        int position = 5;
        int element = 100;

        for (int i = my_Array.length;i< position-1;i--)
        {
            my_Array[i]=my_Array[i-1];
        }
       my_Array[position-1]=element;
        for (int i = 0; i<my_Array.length;i++){
            System.out.print(my_Array[i] + "  ");
        }
    }

}
