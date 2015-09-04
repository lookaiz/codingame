package codingame;

import java.util.Scanner;

public class LePouvoirDeThor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt();
        int LY = in.nextInt();
        int TX = in.nextInt();
        int TY = in.nextInt();

        while (true) {
            in.nextInt();
            String c = dir(LX, LY, TX, TY);
            switch (c) {
            case "N":
                TY--;
                break;
            case "S":
                TY++;
                break;
            case "E":
                TX++;
                break;
            case "W":
                TX--;
                break;
            case "NE":
                TY--;
                TX++;
                break;
            case "NW":
                TY--;
                TX--;
                break;
            case "SE":
                TY++;
                TX++;
                break;
            case "SW":
                TY++;
                TX--;
                break;
            default:
                break;
            }
            System.out.println(c);
        }
    }

    public static String dir(int LX, int LY, int TX, int TY) {
        String Y = (TY < LY) ? "S" : (TY > LY) ? "N" : "";
        String X = (TX < LX) ? "E" : (TX > LX) ? "W" : "";
        return Y + X;
    }
}
