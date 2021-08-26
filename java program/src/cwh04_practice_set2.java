import java.util.Scanner;
class Subject{
    int max = 100;
    int obtd;
}

public class cwh04_practice_set2 {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        System.out.println("Enter mark of maths");
        Scanner sch = new Scanner(System.in);
        s1.obtd = sch.nextInt();

        Subject s2 = new Subject();
        System.out.println("enter marks of physics");
        s2.obtd = sch.nextInt();

        Subject s3 = new Subject();
        System.out.println("enter marks of chemistry");
        s3.obtd = sch.nextInt();

        Subject s4 = new Subject();
        System.out.println("enter marks of IT");
        s4.obtd = sch.nextInt();

        Subject s5 = new Subject();
        System.out.println("enter marks of English");
        s5.obtd = sch.nextInt();

        int total = (s1.obtd) + (s2.obtd) + (s3.obtd) + (s4.obtd) + (s5.obtd);
        int pecentage = (total*100/500);
        System.out.println("percentage is " + pecentage);
    }
}
