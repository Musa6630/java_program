import java.util.Scanner;

public class CWH_15_practice_set_SolutionsCH4 {
    public static void main(String[] args) {
       /*
        //question no 2
        Subject mark1 = new Subject();
        System.out.println("Enter marks in physics");
        Scanner input = new Scanner(System.in);
        mark1.obtd = input.nextInt();

        Subject mark2 = new Subject();
        System.out.println("Enter marks in chemistry");
        mark2.obtd = input.nextInt();

        Subject mark3 = new Subject();
        System.out.println("Enter marks in maths");
        mark3.obtd = input.nextInt();

        float total = (mark1.obtd) + (mark2.obtd) + (mark3.obtd);
        System.out.println("Total marks of three subjects is:" + total);

        float percentage = (total*100/300);
        System.out.println("Percentage of students marks is: " + percentage);

        if(percentage>40){
            if (mark1.obtd>30 && mark2.obtd>30 && mark3.obtd>30) {
                System.out.println("pass");
            }
            if (mark1.obtd<30 || mark2.obtd<30 || mark3.obtd<30){
                    System.out.println("fail");
                }
            }
        else if (percentage<40){
            System.out.println("fail");
        }
        */
        /*
    //question 3
        int amount;
        System.out.println("enter your amount");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        int tax_amount1 = (amount*5/100);
        int tax_amount2 = (amount*20/100);
        int tax_amount3 = (amount*30/100);

        if (amount<250000){
            System.out.println("the tax paid by employee is 000");
        }
        else if (amount>250000 && amount<500000){
            System.out.println("tax paid by employee " + tax_amount1);
        }
        else if (amount>500000 && amount<1000000){
            System.out.println("Tax paid by employee: " + tax_amount2);
        }
        if (amount>1000000){
            System.out.println("Tax paid by employee: " + tax_amount3);
        }
         */
        //question 4
        int number;
        System.out.println("Enter day number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        //Question 5

        }
    }

