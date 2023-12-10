package BEGINNER;

import java.io.IOException;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = sc.nextFloat();
        System.out.printf("%.3f km/l\n", x / y);
        sc.close();
    }
}
