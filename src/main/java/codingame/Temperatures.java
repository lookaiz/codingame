package codingame;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Temperatures {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            in.nextLine();
            StringTokenizer st = new StringTokenizer(in.nextLine());
            n = Integer.MAX_VALUE;
            while (st.hasMoreTokens()) {
                int t = Math.abs(Integer.valueOf(st.nextToken()));
                if (t < n) {
                    n = t;
                }
            }
        }
        System.out.println(n);
    }
}
