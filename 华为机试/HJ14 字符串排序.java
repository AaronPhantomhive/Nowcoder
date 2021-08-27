import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) { // 使用hasNextLine会出现非法越界情况
            int num = sc.nextInt();
            String[] ArrList = new String[num];
            for(int i = 0; i < num; i++) {
                String str = sc.next(); // 使用hasNextLine会出现非法越界情况
                ArrList[i] = str;
            }
            Arrays.sort(ArrList);
            for(int j = 0; j < ArrList.length; j++) {
                System.out.println(ArrList[j]);
            }
        }
    }
}
