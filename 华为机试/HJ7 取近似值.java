import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int result = (int)Math.round(f);
        System.out.println(result);
    }
}
