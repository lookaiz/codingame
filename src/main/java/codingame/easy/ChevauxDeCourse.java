package codingame.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChevauxDeCourse {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < nb; i++) {
            int pi = in.nextInt();
            nums.add(Integer.valueOf(pi));
        }

        Collections.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nb - 1; i++) {
            minDiff = Math.min(minDiff, nums.get(i + 1).intValue() - nums.get(i).intValue());
        }

        System.out.println(minDiff);
        in.close();

    }
}
