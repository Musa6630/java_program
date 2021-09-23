public class CWH_30_VAR_ARGS {
    /*
    static int sum(int a,int b){
    return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
     */
    /*
    static int sum(int ...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
     */
    static int product(int x,int...arr){
        x=20;
        int multi=x;
        for (int a:arr){
            multi=multi*a;
        }
        return multi;
    }
    public static void main(String[] args) {
        //System.out.println("the sum of a and b is " + sum(3,6));
        //System.out.println("The sum of a, and c is "+ sum(3,4,6));
        //System.out.println("The sum of a b c and d is " +sum(2,3,4,1,2,3,12,21));
        System.out.println("The product of 2,3,4 and 8 is " + product(20,3,4));
        System.out.println("The product od 12 15 and 34 is " + product(20,15,3));
    }
}
