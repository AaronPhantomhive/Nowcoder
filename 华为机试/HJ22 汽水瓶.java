import java.util.*;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
// 最最简单的做法：n/2
//         while(!sc.hasNext("0")){
//             int bottle = sc.nextInt();
//             System.out.println(bottle/2);
//         }
        while(!sc.hasNext("0")){
            int bottle = sc.nextInt();
            int result = 0;
            while(bottle >= 3) {
                result = result + bottle / 3;
                bottle = bottle % 3 + bottle / 3;
            }
            if (bottle == 2) {
                result++;
            }
            System.out.println(result);
        }
    }
}
