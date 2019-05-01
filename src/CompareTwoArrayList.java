//write a java program to compare to array list

import java.util.ArrayList;

public class CompareTwoArrayList {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Priya");
        list1.add("Deepak");
        list1.add("Sonam");
        list1.add("Palak");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Priya");
        list2.add("Deepak");
        list2.add("Sonam");
        list2.add("Palak");
        System.out.println(list2);
        System.out.println(list1.equals(list2));
    }


}
