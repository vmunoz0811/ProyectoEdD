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
        int j2=0;
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
                        System.out.println("Se ha encontrado coincidencias: fila--> " + (i+1) + ", columna--> " + col);
                        j2=cont1;
                        if(j2>=a){
                            System.out.println("cumple con las condiciones");
                            cont1 = 0;
                            col = 0;
                        }else {
                            System.out.println("no cumple con las condiones");
                            //cont1 = 0;

                        }


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
