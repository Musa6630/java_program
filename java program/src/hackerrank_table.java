import java.util.Scanner;
public class hackerrank_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input2 = input.nextInt();

        for(int i=1;i<=10;i++){
            int res = input2*i;
            System.out.println(input2 + " x " + i + " = " + res );

        }
    }
}
