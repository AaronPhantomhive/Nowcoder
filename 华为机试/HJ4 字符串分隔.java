import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            String typeIn = sc.nextLine();
            if (typeIn.length() == 8) {
                System.out.println(typeIn);
            } else {
                while (typeIn.length() > 8){
                    System.out.println(typeIn.substring(0,8));
                    typeIn = typeIn.substring(8);
                }
                while (typeIn.length() < 8) {
                    typeIn = typeIn + "0";
                }
                System.out.println(typeIn);
            }
        }
    }
}
