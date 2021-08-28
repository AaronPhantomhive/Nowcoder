import java.util.*;
public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String [] ArrayList = sc.nextLine().split(";");
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < ArrayList.length; i++) {
            if(ArrayList[i].equals("")){ }
            else if (!ArrayList[i].substring(1, ArrayList[i].length()).contains("W") && !ArrayList[i].substring(1, ArrayList[i].length()).contains("A") && !ArrayList[i].substring(1, ArrayList[i].length()).contains("S") && !ArrayList[i].substring(1, ArrayList[i].length()).contains("D")) {
                if(ArrayList[i].substring(0,1).equals("A")) {
                    x -= Integer.valueOf(ArrayList[i].substring(1, ArrayList[i].length()));
                }
                else if(ArrayList[i].substring(0,1).equals("S")) {
                    y -= Integer.valueOf(ArrayList[i].substring(1, ArrayList[i].length()));
                }
                else if(ArrayList[i].substring(0,1).equals("W")) {
                    y += Integer.valueOf(ArrayList[i].substring(1, ArrayList[i].length()));
                }
                else if(ArrayList[i].substring(0,1).equals("D")) {
                    x += Integer.valueOf(ArrayList[i].substring(1, ArrayList[i].length()));
                }
            }
        }
        System.out.println(x + "," + y);
    }
}
