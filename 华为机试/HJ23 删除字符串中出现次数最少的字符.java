import java.util.*;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            String str = sc.nextLine();
            int num = 0;
            // put value in map
            for(int i = 0; i < str.length(); i++) {
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                } else {
                    map.put(str.charAt(i), 1);
                }
            }
            // count min
            int min = Integer.MAX_VALUE;
            for (char s : map.keySet()) {
                if(map.get(s) < min){
                    min = map.get(s);
                }
            }
            // result
            for (int i = 0; i < str.length(); i++) {
                if (map.get(str.charAt(i)) != min){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
