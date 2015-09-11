package codingame.easy;

import java.util.Scanner;

public class Defibrillateurs {

    private static final double RADIUS = 6371d;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double longitude = Double.valueOf(in.next().replace(',', '.'));
        in.nextLine();
        double latitude = Double.valueOf(in.next().replace(',', '.'));
        in.nextLine();
        int n = in.nextInt();
        in.nextLine();

        String name = "";
        double distance = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String[] d = in.nextLine().replace(',', '.').split(";");
            double dist = getDistance(Double.valueOf(d[4]), Double.valueOf(d[5]), longitude, latitude);
            if (dist < distance) {
                distance = dist;
                name = d[1];
            }
        }
        System.out.println(name);
    }

    public static double getDistance(double longitudeB, double latitudeB, double longitudeA, double latitudeA) {
        double x = (longitudeB - longitudeA) * Math.cos((latitudeA + latitudeB) * 0.5);
        double y = (latitudeB - latitudeA);
        return RADIUS * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
