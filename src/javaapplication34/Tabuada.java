/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 1, y;
        int resposta;
        System.out.print("Qual tabuada deseja calcular? ");
        y = teclado.nextInt();
        while (x >= 1 && x <= 10) {

            resposta = x * y;

            System.out.println(y + " X " + x + " = " + resposta);
            x++;
        }

    }

}
