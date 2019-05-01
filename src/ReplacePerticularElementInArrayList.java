//write a program to replace particular element in array list

import java.util.ArrayList;
import java.util.Arrays;

public class ReplacePerticularElementInArrayList {

    public static void main(String[] args)
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "Alia", "Sonia", "Tania") );

        System.out.println(namesList);  //list size is 3

        //Add element at 0 index
        namesList.set(0, "Kayla");

        System.out.println(namesList);  //list size is 3
    }

}
