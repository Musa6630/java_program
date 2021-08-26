import java.util.Locale;

public class cwh10_strings_methods {
    public static void main(String[] args) {
        String name = "Musabbir Afque";
    //    int value = name.length();
    //    System.out.println(value);

    //    String value2 = name.toLowerCase();
    //    System.out.println(value2);

    //    String value3 = name.toUpperCase();
    //    System.out.println(value3);

    //    String nonTrimmedString = "     Harry     ";
    //    System.out.println(nonTrimmedString);

    //      String trimmedString = nonTrimmedString.trim();
    //      System.out.println(trimmedString);

    //    System.out.println(name.substring(4,11));

    //    System.out.println(name.replace('a','e'));
    //    System.out.println(name.replace("Afque","Boss"));

    //    System.out.println(name.startsWith("Mu"));
    //    System.out.println(name.endsWith("qe"));
    //    System.out.println(name.charAt(2));

        System.out.println(name.indexOf("u", 0));

        System.out.println(name.lastIndexOf("u",12));

        System.out.println(name.equals("Musabbir afque"));

        System.out.println(name.equalsIgnoreCase("musabbir afque"));

        System.out.println("this is a \" good boy");
    }
}
