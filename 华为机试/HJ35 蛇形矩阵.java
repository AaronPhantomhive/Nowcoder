import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lines = 0;

        while (scanner.hasNext()){
            lines = scanner.nextInt();
            printSnakeNum(lines);
        }
    }

    public static void printSnakeNum(int lines){
        int head = 1;    
        for (int i = 0; i < lines; i++){
            head += i;    
            System.out.print(head + " ");
            int body = head;
            for (int j = i + 2; j <= lines; j++){
                body += j;
                System.out.print(body + " ");
            }
            System.out.println();
        }
    }
}
