import java.util.Scanner;

public class cwh09_strings {
    public static void main(String[] args) {
        //String name = new String("my name is musabbir");
        //System.out.println(name);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        System.out.println("hiie " + name + " Have a good day!");
        String name2 = "Harry";
        String name1 = "harry bhai";
        System.out.println("hiie " + name2 + " have a good day!");
    }
}
