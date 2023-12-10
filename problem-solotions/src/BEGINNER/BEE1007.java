package BEGINNER;

import java.io.IOException;
import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.printf("DIFERENCA = %d\n", (a * b - c * d));
        sc.close();
    }
}
