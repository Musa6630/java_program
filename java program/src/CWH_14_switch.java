import java.util.Scanner;

public class CWH_14_switch {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

       /* switch (age) {
            case 3 -> System.out.println("baby");
            case 7 -> System.out.println("name");
            case 15 -> System.out.println("teenager");
            case 21 -> System.out.println("men");
            default -> System.out.println("error");
        }
        */
        switch (age){
            case 17:
                System.out.println("child");
                break;
            case 7:
                System.out.println("name");
                break;
            case 15:
                System.out.println("teenager");
                break;
            case 21:
                System.out.println("men");
                break;
            default:
                System.out.println("error");
        }


    }
}
