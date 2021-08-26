import java.util.Scanner;

public class hackerank {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        }
        else {

            if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);
        sc.close();
    }
    }

     /*
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if(a % 2 == 0 && a>=2 && a >= 5 ) {
            System.out.print("Not Weird");
        }
        else if(a % 2 == 0 && 6 <= a && a >= 20){
            System.out.print("Weird");
        }
        else if(a % 2 == 0 && a>20){
            System.out.print("Not Weird");
        }

else{
            System.out.print("Weird");
        }
*/


