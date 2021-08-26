import java.util.Scanner;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            String str = sc.nextLine();
            int result = Integer.parseInt(str.substring(2),16);
            System.out.println(result);
        }
    }
}
