import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        num1 = scan.nextInt();
        System.out.println("Enter the Second number : ");
        num2 = scan.nextInt();

     System.out.println(isSixtyFive(num1,num2));

        String [] animals = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
       longest(animals);
    }


    public static boolean isSixtyFive(int num1, int num2)
    {
//

        return (num1 == 65 || num2 == 65 || (num1 + num2 == 65)) ? true : false;

    }

    public static void longest(String[] animals)
    {
//        String animals[] = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};

        int long_Word = animals[0].length();
        String long_Word_Name = animals[0];

        for(int x = 0; x < animals.length; x++)
        {
            if((animals[x].length() >= long_Word))
            {
                long_Word = animals[x].length();
                long_Word_Name = animals[x];
            }
        }
        System.out.println(long_Word_Name);
    }
}