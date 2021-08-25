import java.util.Scanner;

public class Main{
    public static void main (String arg[]) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        String toBinary = Integer.toBinaryString(a);
        
        int count = 0;
        
        for(int i = 0; i < toBinary.length(); i++) {
            char b = toBinary.charAt(i);
            if (b == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
