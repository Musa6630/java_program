import java.util.Scanner;

public class CWH_26_practice_question_ch6 {
    public static void main(String[] args) {
        /*
        //question no 1.
        float [] marks={12f,32f,32f,15f,89f};
                float sum=0;
        for (float element:marks)
        {
            sum=sum+element;
        }
        System.out.println(sum);

         */
        /*
        //question no 2.
        float [] marks={12f,32f,32f,15f,89f};
        //System.out.println("enter any number");
        //Scanner input=new Scanner(System.in);
        //float number=input.nextFloat();
        float number=12;
        boolean isInArray=false;
        for (float element:marks)
        {
            if (number==element)
                isInArray=true;
                break;
        }
        if (isInArray)
        {
            System.out.println("the num is in the array");
        }
        else
        {
            System.out.println("not in the array");
        }
         */
        /*
        //Question no 3. in type 1 solution
        System.out.println("Q no 3 in type 1");
        float [] marks={65f,78f,86f,54f,98f};
        float sum=0;
        float average=0;
        for (float element:marks)
        {
            sum=sum+element;
            average=sum/5;
        }
        System.out.println(average);
        */
        /*
        //qno 3 in type 2
        float [] marks={12f,32f,32f,15f,89f};
        float sum=0;
        for (float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("The average marks of students in 5 subjects is "+sum/marks.length);

         */
        /*
        //question no 4.
        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{8,9,10},{11,12,13}};
        int [][] result ={{0,0,0},{0,0,0}};

        for (int i=0; i<mat1.length;i++)
        {
            for (int j=0;j<mat1[i].length;j++)
            {
                result[i][j]=mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
        */
        /*
        //question no 5.
        int [] array={1,2,3,4,65,32,34,87};
        int l= array.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for (int i=0; i<n; i++)
        {
            temp=array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }
        for (int element:array)
        {
            System.out.println(element + " ");
        }

         */
        /*
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n= sc.nextInt();
        int[] array=new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
                array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");

        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }

         */
        /*
        //question no 6.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n= input.nextInt();
        int[] array=new int[100];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=input.nextInt();
        }
        //int [] array={1,2,43,21,443,43,2,6,3,456,231};
        int max=0;
        for (int e:array)
        {
            if (e>max){
                max=e;
            }
        }
        System.out.println("THE MAXIMUM ELEMENT IN THIS ARRAY IS: " + max);
         */
        /*
        //question no 7.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n= input.nextInt();
        int[] array=new int[100];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=input.nextInt();
        }
        //int [] array={1,2,43,21,443,43,2,6,3,456,231};
        int max = Integer.MIN_VALUE;
        for(int e: array){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);
         */
        /*
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n= input.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=input.nextInt();
        }
        //int [] array={1,2,43,21,443,43,2,6,3,456,231};
        int min =Integer.MAX_VALUE;
        for(int e:array){
            if(e<Integer.MAX_VALUE){
                min = e;
            }
        }
        System.out.println("the value of the minimum element in this array is: "+ min);
         */
        
        //question no 8.

        Scanner input = new Scanner(System.in);
        System.out.print("Number of elements in array: ");
        int num = input.nextInt();								//	Number of elements in the array
        int[] array = new int[num];
        System.out.println("Enter the elements of array: ");
        for (int i = 0 ; i < num; i++ ) {						//Taking inputs from elements
            array[i] = input.nextInt();
        }
        boolean issorted=true;
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                issorted=false;
                break;
            }
        }
        if (issorted){
            System.out.println("The given elements are sorted");
        }
        else
            System.out.println("The given elements are not sorted");


    }
}
