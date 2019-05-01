//write a java program to find common element between two arrays(String value)

public class CommonElementBetweenTwoArrays {

    public static void main(String[] args) {

        String array1[] = {"black","red","pink","red","yellow","blue"};
        String arrya2[] = {"pink","blue","brown","purple","green","red"};

        for (int i =0;i<array1.length;i++)
        {
            for (int j = 0;j<arrya2.length;j++)
            {
                if (array1[i]==arrya2[j])
                {
                System.out.println(array1[i]);

            }
            }

            }
    }
    }






