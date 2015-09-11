package codingame.easy;

import java.util.Scanner;

public class LaDescente {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            in.nextInt();

            int max = -1;
            int idx = -1;
            for (int i = 0; i < 8; i++) {
                int m = in.nextInt();
                if (m > max) {
                    max = m;
                    idx = i;
                }
            }

            System.out.println((spaceX == idx) ? "FIRE" : "HOLD");
        }
    }
}
