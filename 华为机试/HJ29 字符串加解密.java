import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String before = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String after = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890";
        while(sc.hasNextLine()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for(int i = 0;i<s1.length();i++){
                System.out.print(after.charAt(before.indexOf(s1.charAt(i))));
            }
            System.out.println();
            for(int i = 0;i<s2.length();i++){
                System.out.print(before.charAt(after.indexOf(s2.charAt(i))));
            }
            System.out.println();
        }
    }
}
// 同类型题还有HJ36 字符串加密
