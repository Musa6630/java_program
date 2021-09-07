import java.util.Scanner;
public class CWH_13_ifElseif_ladder {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>45){
            System.out.println("You are experienced");
        }
        else if (age>35){
            System.out.println("You are semi experienced ");
        }

        else{
            System.out.println("You are not eligible");
        }
    }
}
