import java.util.*;
public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            if (check(str)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
    
    public static boolean check(String str) {
        // request 1
        if (str.length() <= 8) return false;
        // request 2
        int low = 0, up = 0, num = 0, sym = 0;
        for(int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if(tmp >= 'a' && tmp <= 'z'){
                low = 1;
            }
            else if(tmp >= 'A' && tmp <= 'Z'){
                up = 1;
            }
            else if(tmp >= '0' && tmp <= '9'){
                num = 1;
            }
            else{
                sym = 1;
            }
        }
        if (low + up + num + sym < 3) {
            return false;
        }
        // request 3
        for(int i = 0; i < str.length(); i++){
            for(int j = i+3; j < str.length(); j++){
                String tmp = str.substring(i, j);
                if(str.substring(j).contains(tmp)){
                    return false;
                }
            }
        }
        return true;
    }
}
