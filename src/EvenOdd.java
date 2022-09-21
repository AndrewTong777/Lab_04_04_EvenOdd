import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        int numberhere;
        System.out.print("Enter your number over here: ");
        Scanner input = new Scanner(System.in);
        numberhere = input.nextInt();
        if ( numberhere % 2 == 0 )
            System.out.println(numberhere+" this number is even.");
        else
            System.out.println(numberhere+" this number is odd.");
    }
}