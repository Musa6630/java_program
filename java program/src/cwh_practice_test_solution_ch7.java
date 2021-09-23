import java.util.Scanner;

public class cwh_practice_test_solution_ch7 {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+ " X "+ i +"="+n*i );
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){//this line is for horizontal length
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumrec(int n){
        if (n==1){
            return 1;
        }
        return n+sumrec(n-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        multiplication(x);
        pattern1(x);
        //sumrec(7);
        System.out.println(sumrec(7));
    }
}
