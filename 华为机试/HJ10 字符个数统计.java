import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Object> set = new HashSet<Object>();
        for(int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        System.out.println(set.size());
    }
}
