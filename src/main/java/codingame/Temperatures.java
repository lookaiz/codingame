package codingame;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Dans cet exercice, on vous demande d'écrire un programme capable d'analyser
 * un relevé de températures pour trouver quelle température se rapproche le
 * plus de zéro.
 * 
 * ENTRÉE : Ligne 1 : le nombre N de températures à analyser Ligne 2 : les N
 * températures exprimées sous la forme de nombres entiers allant de -273 à 5526
 * 
 * SORTIE : Affichez 0 (zéro) si aucune température n'est fournie. Sinon,
 * affichez la température la plus proche de 0 sachant que si deux entiers sont
 * aussi proches de zéro, l'entier positif devra être considéré comme étant le
 * plus proche de zéro (par exemple si les températures sont -5 et 5, affichez
 * 5).
 * 
 * CONTRAINTES : 0 ≤ N < 10000
 * 
 * @author lookaiz
 */
public class Temperatures {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            in.nextLine();
            StringTokenizer st = new StringTokenizer(in.nextLine());
            n = Integer.MAX_VALUE;
            while (st.hasMoreTokens()) {
                int t = Integer.valueOf(st.nextToken());
                if (Math.abs(t) < Math.abs(n) || ((Math.abs(t) == Math.abs(n)) && (t > n))) {
                    n = t;
                }
            }
        }
        System.out.println(n);
        in.close();
    }

}
