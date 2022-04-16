package Controller;

import Model.Matriz;
import View.Console;

import java.util.InputMismatchException;

public class Controller {
    private Matriz model;
    private Console view;
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public Controller(){
        model = new Matriz();
        view = new Console();
        init();
    }
    public void init(){
        try{
            System.out.println(ANSI_CYAN + "Bienvenido al juego de matrices" + ANSI_RESET);
            int y = view.readInt("¿Cuántos casos quiere evaluar?");
            int menu = 0;
            int j = 1;
            do {
                int x = view.readInt("Indique el tamaño de la matriz");
                System.out.println(ANSI_PURPLE + "Elija la opción que desea ejecutar" + ANSI_RESET);
                menu = view.readInt("1. Crear matriz y evaluar si cumple las divisiones" + "\n0.Salir");
                switch (menu) {
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println(ANSI_YELLOW + "Caso No." + j + ANSI_RESET);
                        model.createMatrizRandom(x);
                        break;
                }
                j++;
            }
            while(j <= y);

        }catch (InputMismatchException e){
            view.showInfo("No puedes ingresar letras, solo números");
        }
    }
}
