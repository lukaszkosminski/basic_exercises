package org.example.JavaSE.Ex2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Lotto {
    public static void start() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj zakres");
            int zakres = scanner.nextInt();
            System.out.println("podaj ile liczb do wylosowania");
            int ileLiczb = scanner.nextInt();

            Random generator = new Random();
            List<Integer> lotto = new ArrayList<>();

            for (int i = 0; !(ileLiczb == lotto.size()); i++) {
                int random = (generator.nextInt(zakres) + 1);
                if (!lotto.contains(random)) {
                    lotto.add(random);
                }
                Collections.sort(lotto);
            }

            for (int i = 0; i < lotto.size(); i++) {
                System.out.print(lotto.get(i) + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            PrintWriter out = new PrintWriter("lotto.txt");
            out.print(lotto);
            out.close();
        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println("niepoprawne dane");
        }
    }
}

