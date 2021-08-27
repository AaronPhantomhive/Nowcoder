// HJ11 数字颠倒 
// HJ12 字符串反转
// 两题同理
import java.util.*;
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
