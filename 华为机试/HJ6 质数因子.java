import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            long num = sc.nextLong();
            long num2 = (long)Math.sqrt(num);
            for (int i = 2; i <= num2; i++) {
                while(num % i == 0) {
                    num/=i;
                    System.out.print(i + " ");
                }
            }
            System.out.println(num == 1 ? "" : num + " "); // 这步没有很懂
        }
    }
}
