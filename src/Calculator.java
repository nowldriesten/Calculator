import java.util.Scanner;

public class Calculator
{

    public static void main(String[] args)
    {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Voer het eerste nummer in");
        num1 = input.nextInt();

        System.out.println("Voer het tweede nummer in");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Voer handeling in (+,-,/,*)");
        operation = op.next();

        if (operation.equals ("+"))
        {
            System.out.println("Antwoord = " +(num1 + num2));
        }
        if  (operation.equals ("-"))
        {
            System.out.println("Antwoord = " + (num1 - num2));
        }
        if (operation.equals ("/"))
        {
            System.out.println("Antwoord = " + (num1 / num2));
        }
        if (operation.equals ("*"))
        {
            System.out.println("Antwoord = " + (num1 * num2));
        }


    }
}
