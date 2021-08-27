import java.util.Scanner;
public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i = str.length(); i != 0; i--) {
            if (i != 0) System.out.print(str.charAt(i-1));
            else System.out.print(str.charAt(i));
        }
    }
}
