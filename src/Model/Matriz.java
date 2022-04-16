package Model;

import java.util.Random;

public class Matriz {
    private int a;

    public Matriz() {
    }

    public void createMatrizRandom (int b){
        a = b;
        Random random = new Random();
        int [][] matriz = new int [a][b];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(b-1+1)+1;
            }
        }
        String rta = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                rta = rta + " | "+ matriz[i][j] + " | ";
            }
            rta = rta + "\n";
        }
        System.out.println(rta);
    }
}
