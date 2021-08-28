// 一定会得0分的憨批hardcode写法
import java.util.*;
public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
                    System.out.print("2");
                } else if (str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f') {
                    System.out.print("3");
                } else if (str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i') {
                    System.out.print("4");
                } else if (str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l') {
                    System.out.print("5");
                } else if (str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o') {
                    System.out.print("6");
                } else if (str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's') {
                    System.out.print("7");
                } else if (str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v') {
                    System.out.print("8");
                } else if (str.charAt(i) == 'w' || str.charAt(i) == 'x' || str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                    System.out.print("9");
                }
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.print(str.charAt(i));
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                if (str.charAt(i) == 'A'){ System.out.print("b"); }
                if (str.charAt(i) == 'B'){ System.out.print("c"); }
                if (str.charAt(i) == 'C'){ System.out.print("d"); }
                if (str.charAt(i) == 'D'){ System.out.print("e"); }
                if (str.charAt(i) == 'E'){ System.out.print("f"); }
                if (str.charAt(i) == 'F'){ System.out.print("g"); }
                if (str.charAt(i) == 'G'){ System.out.print("h"); }
                if (str.charAt(i) == 'H'){ System.out.print("i"); }
                if (str.charAt(i) == 'I'){ System.out.print("j"); }
                if (str.charAt(i) == 'J'){ System.out.print("k"); }
                if (str.charAt(i) == 'K'){ System.out.print("l"); }
                if (str.charAt(i) == 'L'){ System.out.print("m"); }
                if (str.charAt(i) == 'M'){ System.out.print("n"); }
                if (str.charAt(i) == 'N'){ System.out.print("o"); }
                if (str.charAt(i) == 'O'){ System.out.print("p"); }
                if (str.charAt(i) == 'P'){ System.out.print("q"); }
                if (str.charAt(i) == 'Q'){ System.out.print("r"); }
                if (str.charAt(i) == 'R'){ System.out.print("s"); }
                if (str.charAt(i) == 'S'){ System.out.print("t"); }
                if (str.charAt(i) == 'T'){ System.out.print("u"); }
                if (str.charAt(i) == 'U'){ System.out.print("v"); }
                if (str.charAt(i) == 'V'){ System.out.print("w"); }
                if (str.charAt(i) == 'W'){ System.out.print("x"); }
                if (str.charAt(i) == 'X'){ System.out.print("y"); }
                if (str.charAt(i) == 'Y'){ System.out.print("z"); }
                if (str.charAt(i) == 'Z'){ System.out.print("a"); }
            }
        }
    }
}
