package Model;

import java.util.Random;

public class Matriz {
    private int[][] matriz;
    public Matriz() {
    }

    public void createMatrizRandom (int b) {

        int a = b;
        Random random = new Random();
        matriz = new int[a][b];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(b - 1 + 1) + 1;
            }
        }
        String rta = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                rta = rta + " | " + matriz[i][j] + " | ";
            }
            rta = rta + "\n";
        }
        System.out.println(rta);
    }
        public boolean validation (int b) {
            createMatrizRandom(b);
            int quantity = 0;
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == 0 || (i + 1) == b || j == 0 || (j + 1) == b) {
                        if (i == 0 && j == 0) {
                            if ((matriz[i][j] == matriz[i][j + 1]) || (matriz[i][j] == matriz[i + 1][j]))
                                quantity++;
                        } else if (i == 0 && (j + 1) == b) {
                            if ((matriz[i][j] == matriz[i][j - 1]) || (matriz[i][j] == matriz[i + 1][j]))
                                quantity++;
                        } else if ((i + 1) == b && j == 0) {
                            if ((matriz[i][j] == matriz[i - 1][j]) || (matriz[i][j] == matriz[i][j + 1]))
                                quantity++;
                        } else if ((i + 1) == b && (j + 1) == b) {
                            if ((matriz[i][j] == matriz[i][j - 1]) || (matriz[i][j] == matriz[i - 1][j]))
                                quantity++;
                        } else {
                            if (i > 0 && j == 0) {
                                if (matriz[i][j] == matriz[i - 1][j] || matriz[i][j] == matriz[i][j + 1] || matriz[i][j] == matriz[i + 1][j])
                                    quantity++;
                            } else if (i == 0 && j > 0) {
                                if (matriz[i][j] == matriz[i][j - 1] || matriz[i][j] == matriz[i][j + 1] || matriz[i][j] == matriz[i + 1][j])
                                    quantity++;
                            } else if (i > 0 && (j + 1) == b) {
                                if (matriz[i][j] == matriz[i - 1][j] || matriz[i][j] == matriz[i][j - 1] || matriz[i][j] == matriz[i + 1][j])
                                    quantity++;
                            } else if ((i + 1) == b && j > 0) {
                                if (matriz[i][j] == matriz[i][j - 1] || matriz[i][j] == matriz[i][j + 1] || matriz[i][j] == matriz[i - 1][j])
                                    quantity++;
                            }
                        }
                    } else {
                        if (matriz[i][j] == matriz[i][j - 1] || matriz[i][j] == matriz[i][j + 1] || matriz[i][j] == matriz[i - 1][j] || matriz[i][j] == matriz[i + 1][j])
                            quantity++;
                    }
                }
            }
            return quantity == (b * b);

        }

}
