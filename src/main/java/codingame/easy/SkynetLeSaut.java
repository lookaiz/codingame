package codingame.easy;

import java.util.Scanner;

public class SkynetLeSaut {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.

            if ((coordX + 1) == road) {
                // Just before the gap
                System.out.println("JUMP");
            }
            else if (gap < (speed - 1)) {
                System.out.println("SLOW");
            }
            else if (coordX >= (road + gap)) {
                // After the gap
                System.out.println("SLOW");
            }
            else if (gap == (speed - 1)) {
                System.out.println("WAIT");
            }
            else {
                System.out.println("SPEED");
            }
        }
    }
}
