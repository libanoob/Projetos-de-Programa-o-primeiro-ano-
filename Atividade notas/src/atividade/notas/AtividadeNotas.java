/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.notas;

import java.util.Scanner;
public class AtividadeNotas {

  
    public static double mediaCalculo (double[] notas) {
        
        double soma = 0;
        for (int i = 0; i<notas.length; i++) {
            soma += notas[i];
        }
        double media;
        media = soma / notas.length;
                
        
        System.out.println("media das notas: " +media);
        return media;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double [] notas = new double [4];
        int indice = 0;
       
        for (int i = 0; i < notas.length; i++) {
            System.out.println("avaliacao " +(i + 1) +":");
            notas[i] = teclado.nextDouble();
            
            indice++;
        }        
            for (int i = 0; i<notas.length; i++) {
                System.out.println("notas recebidas: " +notas[i] );
            }    
               mediaCalculo(notas);
            

    }
}
