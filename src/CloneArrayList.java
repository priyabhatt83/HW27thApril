//write a program to clone array list in another array list

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> a1= new ArrayList<String>();
        a1.add("Priya");
        a1.add("Deepak");
        a1.add("Palak");
        a1.add("Sonam");
        a1.add("Ajay");
        System.out.println("Original array list: " + a1);
        ArrayList<String> newa1 = (ArrayList<String>)a1.clone();
        System.out.println("Cloned array list: " + newa1);
    }

}
