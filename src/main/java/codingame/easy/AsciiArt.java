package codingame.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsciiArt {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt(); // length
        in.nextLine();
        int h = in.nextInt(); // height
        in.nextLine();
        String t = in.nextLine(); // text

        List<String> rows = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            rows.add(in.nextLine());
        }

        for (int hh = 0; hh < h; hh++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < t.length(); j++) {
                int pos = getCharIndex(Character.toUpperCase(t.charAt(j)));
                sb.append(rows.get(hh).substring((pos - 1) * l, (pos - 1) * l + l));
            }
            System.out.println(sb.toString());
        }
        in.close();
    }

    public static int getCharIndex(char letter) {
        if (letter >= 'A' && letter <= 'Z') {
            return (int) letter - 'A' + 1;
        }
        return 27;
    }
}
