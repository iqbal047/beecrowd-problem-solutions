package BEGINNER;

import java.io.IOException;
import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int PROD = A * B;
        System.out.println("PROD = " + PROD);
        sc.close();
    }
}
