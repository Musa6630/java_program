public class CWH_20_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("no print");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
