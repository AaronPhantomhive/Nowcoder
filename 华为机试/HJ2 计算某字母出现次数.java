import java.util.Scanner;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine().toLowerCase();
        char c = sc.next().toLowerCase().charAt(0);
        
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
