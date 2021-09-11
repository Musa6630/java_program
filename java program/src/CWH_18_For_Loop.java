import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CWH_18_For_Loop {
    public static void main(String[] args) {
        /*
        PRINTING TABLE IN JAVA.
        System.out.println("Printing table in java.");
        System.out.println("Enter the no:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i<=10; i++)
        {

            int result = n * i;
            System.out.println(n + "*" + i + "=" + result);
        }
        */

        System.out.println("Program to find up to first n odd numbers");
        int i;
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        for (i=1; i<m; i=i+2)
        {
            System.out.println(i);
            System.out.println();
        }

        //decrementing for loop
        System.out.println("Decrementing for Loop");
        int n;
        for (n=7; n!=0; n--)
        {
            System.out.println(n);
        }
    }
}
