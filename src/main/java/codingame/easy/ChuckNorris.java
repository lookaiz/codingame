package codingame.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuckNorris {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();

        String bin = stringToBinary(msg);

        String c = bin.substring(0, 1);
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for (int i = 1; i < bin.length(); i++) {
            if (bin.substring(i, i + 1).equals(c)) {
                sb.append(c);
            }
            else {
                c = bin.substring(i, i + 1);
                list.add(sb.toString());
                sb = new StringBuilder();
                sb.append(c);
            }
        }
        list.add(sb.toString());

        sb = new StringBuilder();
        for (int k = 0; k < list.size(); k++) {
            if (k > 0) {
                sb.append(" ");
            }
            String s = list.get(k);

            if (s.substring(0, 1).equals("1")) {
                sb.append("0 ");
            }
            else {
                sb.append("00 ");
            }
            for (int i = 0; i < s.length(); i++) {
                sb.append("0");
            }
        }
        System.out.println(sb.toString());
        in.close();
    }

    public static String stringToBinary(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            String res = Integer.toBinaryString((int) b);
            if (res.length() < 7) {
                res = '0' + res;
            }
            binary.append(res);
        }
        return binary.toString();
    }
}
