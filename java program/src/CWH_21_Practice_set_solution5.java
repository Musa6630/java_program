import java.util.Scanner;

public class CWH_21_Practice_set_solution5 {
    public static void main(String[] args) {
        /*
        //question 1
        int n = 5;
        for (int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */
        /*
        //question 2
        int sum =0;
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0;i<n;i++)
        {
            sum = sum +(2*i);
        }
        System.out.print("sum of first "+n+" even numbers starting from o is: ");
        System.out.print(sum);
         */
        /*
        //question no 2 using while loop.
        int sum =0;
        System.out.println("Enter the number to find the sum of first even numbers; ");
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int i=0;
        while (i<n)
        {
            sum = sum +(2*i);
            i++;
        }
        System.out.print("sum of first "+n+" even numbers starting from o is: "+sum);
         */
        /*
        //question no 3.
        System.out.println("Enter any no to print table:");
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        for (int i=0;i<=10;i++)
        {
            int result=n*i;
            System.out.println(n+"*"+i+"="+result);
        }

         */
        /*
        //question no 4.
        System.out.println("Enter any no to print table:");
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        for (int i=10;i>=1;i--)
        {
            int result=n*i;
            System.out.println(n+"*"+i+"="+result);
        }
         */
        //question no 5.
        /*
        System.out.println("enter number to find the factorial of that any number:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int factorial=1;
        for (int i=1;i<=n;i++)
        {
            factorial =factorial*i;

        }
        System.out.println("Factorial of "+n+" is "+factorial);

         */
        /*
        //question no 5 using while loop.
        System.out.println("enter number to find the factorial of that any number:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int factorial=1;
        int i=1;
        while (i<=n)
        {
            factorial =factorial*i;
            i++;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
         */
        /*
        //question no 6.
        while (true)
        {
            System.out.println("5");
        }

         */
        /*
        //question no 7.
        for(;;)
        {
            System.out.println("1");
        }

         */
        //question no 9.
        System.out.println("Enter any no to print table:");
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int sum=0;
        for (int i=0;i<=10;i++)
        {
            sum=sum+(n*i);
        }
        System.out.println(sum);

    }
}
