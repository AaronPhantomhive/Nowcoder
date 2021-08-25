import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] count = str.split(" ");
        int finalResult = count[count.length - 1].length();
        System.out.println(finalResult);
    }
}
