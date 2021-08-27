import java.util.*;

public class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = Integer.valueOf(sc.nextLine());
            // hashmap不行 得用treemap
//             Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            Map<Integer,Integer> map = new TreeMap();
            
            for(int i = 0; i < num; i++) {
                String[] array = sc.nextLine().split(" ");
                Integer key = Integer.valueOf(array[0]);
                Integer value = Integer.valueOf(array[1]);
                if(map.containsKey(key)) {
                    int sum = map.get(key) + value;
                    map.put(key, sum);
                } else {
                    map.put(key, value);
                }
            }
            
            // 输出hashmap的数值
            for (Integer s : map.keySet()) {
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
