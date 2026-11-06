package com.vetores;

import java.util.Scanner;
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //atividade 1: 
        String paises [] = {"Brasil", "Argentina", "Chile", "Uruguai", "Paraguai"};
        for (int i = 0; i < paises.length; i++) {
            System.out.print(paises[i]);
        }

        //atividade 2: 
        String paisesEuropa[] = new String[5];
        for (int i = 0; i <5; i++) {
            System.out.println("Digite o nome de um país europeu: ");
            paisesEuropa[i] = teclado.nextLine();


        }
        for (int i = 0; i <paisesEuropa.length; i++) {
            System.out.print(paisesEuropa[i]);
        }
    }
}
