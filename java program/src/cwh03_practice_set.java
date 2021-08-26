import java.util.Scanner;

public class cwh03_practice_set {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter mark of maths: ");
        float Maths = mark.nextFloat();
        System.out.println("Enter mark of Physics: ");
        float Physics = mark.nextFloat();
        System.out.println("Enter mark of Chemistry: ");
        float Chemistry = mark.nextFloat();
        System.out.println("Enter mark of IT: ");
        float IT = mark.nextFloat();
        System.out.println("Enter mark of English: ");
        float English = mark.nextFloat();
        float sum = Maths + Physics + Chemistry + IT + English;
        System.out.println("Total marks of the student is: " + sum + " out of 500");
        float percentage = sum/5;
        System.out.println("Percentage of the student is: " + percentage);
    }
}
