// 用大佬的ArrayList写的

import java.util.*;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int i = sc.nextInt();
            List<Integer> l = new ArrayList<Integer>();
            while(i != 0){
                int t = i%10;
                i/=10;
                if(l.contains(t)){ continue;}
                l.add(t);
            }
            for(int result:l) System.out.print(result);
        }
    }
}
