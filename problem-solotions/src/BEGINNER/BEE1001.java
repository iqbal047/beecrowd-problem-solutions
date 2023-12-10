package BEGINNER;

import java.io.IOException;
import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.printf("X = %d\n", A + B);
        sc.close();
    }
}
