import java.util.Scanner;

public class cwh09_strings {
    public static void main(String[] args) {
        //String name = new String("my name is musabbir");
        //System.out.println(name);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        System.out.println("hiie " + name + " Have a good day!");
    //    String name2 = "Harry";
        String name1 = "harry bhai";
        System.out.printf("hiie " + name1 + " have a good day!\n");

        int a = 7;
        float b = 9.89789f;
        System.out.printf(" The value of a is: %d \n The value of b is: %12.2f \n", a , b);
        System.out.printf(" The value of a is: %d \n The value of b is: %f", a , b);
    }
}
