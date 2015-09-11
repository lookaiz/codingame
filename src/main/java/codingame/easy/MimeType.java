package codingame.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MimeType {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();

        Map<String, String> mimes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String eXT = in.next().toLowerCase(); // file extension
            String mT = in.next(); // MIME type.
            mimes.put(eXT, mT);
            in.nextLine();
        }

        for (int i = 0; i < q; i++) {
            String fNAME = in.nextLine(); // One file name per line.
            if (fNAME.contains(".")) {
                fNAME = fNAME.substring(fNAME.lastIndexOf(".") + 1);
                System.out.println(mimes.getOrDefault(fNAME.toLowerCase(), "UNKNOWN"));
            }
            else {
                System.out.println("UNKNOWN");
            }
        }
        in.close();
    }
}
