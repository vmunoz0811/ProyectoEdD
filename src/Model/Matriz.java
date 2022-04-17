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
        int cont1 = 0;
        int col = 0;
        for (int i = 0; i < matriz.length; i++)
        {
            cont1 = 0;
            for (int j = 0; j < matriz[i].length - 1; j++)
            {

                if (matriz[i][j] == matriz[i][j+1])
                {
                    cont1++;
                    if(cont1 != 4)
                    {
                        System.out.println("Se ha encontrado 4 coincidencias: fila--> " + (i+1) + ", columna--> " + col);
                        cont1 = 0;
                        col = 0;
                    }
                }
                else
                {
                    col = j+1;
                }
            }
        }
    }
}
