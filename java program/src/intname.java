import java.util.Scanner;
public class intname {
    public static void main(String[] args) {
        //float [] marks={12f,32f,32f,15f,89f};
        //System.out.println("enter any number");
        //Scanner input=new Scanner(System.in);
        //float number=input.nextFloat();
        //float number=12;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n= input.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=input.nextInt();
        }
        Scanner input2=new Scanner(System.in);
        int n1=input2.nextInt();
        boolean isInArray=false;
        for (float number:array)
        {
            if (n1==number)
                isInArray=true;
            //break;
        }
        if (isInArray)
        {
            System.out.println("the num is in the array");
        }
        else
        {
            System.out.println("not in the array");
        }
    }
}
