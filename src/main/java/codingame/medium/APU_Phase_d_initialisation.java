package codingame.medium;

import java.util.Scanner;

public class APU_Phase_d_initialisation {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        in.nextLine();
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        String[][] arr = new String[height][width];
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            for (int j = 0; j < width; j++) {
                arr[i][j] = line.substring(j, j + 1);
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (arr[i][j].equals("0")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0 0");
                    sb.append(get(arr, i + 1, j));
                    sb.append(get(arr, i, j + 1));
                }
                System.err.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("0 0 1 0 0 1"); // Three coordinates: a node, its right neighbor, its bottom neighbor
    }

    public static String get(String[][] array, int i, int j) {

        if (array.length > i) {
            return " -1 -1";
        }

        String[] line = array[i];
        if (line.length > j) {
            return " -1 -1";
        }

        if (array[i][j].equals("0")) {
            return " " + i + " " + j;
        }
        return " -1 -1";
    }

}
