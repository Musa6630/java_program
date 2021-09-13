public class CWH_24_multi_dim_array {
    public static void main(String[] args) {
        int[][] students=new int[3][4];
        students[0][0]=97;
        students[0][1]=1;
        students[0][2]=4;
        students[0][3]=7;
        students[1][0]=89;
        students[1][1]=1;
        students[1][2]=4;
        students[1][3]=7;
        students[2][0]=98;
        students[2][1]=1;
        students[2][2]=4;
        students[2][3]=7;


        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students[i].length;j++) {
                System.out.print(students[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
