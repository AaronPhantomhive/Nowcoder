import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int typeIn = sc.nextInt();
            int[] ArrList = new int[typeIn];
            for(int i = 0; i < typeIn; i++) {
                ArrList[i] = sc.nextInt();
            }
            Arrays.sort(ArrList);
            for (int j = 0; j < ArrList.length; j++) {
                if(j == 0 || ArrList[j] != ArrList[j-1]){
                    System.out.println(ArrList[j]);
                }
            }
        }
    }
}
