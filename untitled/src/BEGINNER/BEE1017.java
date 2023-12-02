package BEGINNER;

import java.io.IOException;
import java.util.Scanner;

public class BEE1017 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int speed = sc.nextInt();
        System.out.printf("%.3f\n", (time * speed)/12.0);
        sc.close();
    }

}
