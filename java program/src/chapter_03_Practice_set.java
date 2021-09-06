import java.util.Locale;

public class chapter_03_Practice_set {
    public static void main(String[] args) {
        //question 1
        String name = "Musabbir Afque Is a Good Boy";
        System.out.println(name.toLowerCase());

        //question 2
        System.out.println(name.replace(' ','_'));

        //question 3
        String letter = "Dear </name/>, Thanks a lot";
        System.out.println(letter.replace("</name/>","Musabbir"));

        //question 4
        String name1= "My name is   khan  ";
        System.out.println(name1.indexOf("   "));

        //question 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
