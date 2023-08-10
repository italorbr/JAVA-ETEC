/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int op = 0;
        int menu = 0;
        
        do {
            System.out.println("1 - MENSAGEMN \n2 - CALCULO");
            menu = grava.nextInt();
            
            if (menu == 1){
                System.out.println("Ola seja bem vindo ao JAVA!");
            }else if(menu == 2) {
                System.out.println("2 + 2 = 4");
            }else {
                System.out.println("OPCAO INVALIDA");
            }
            
            System.out.println("2 - para continuar \n4 - para sair");
            op = grava.nextInt();
            
        } while(op!=4);
        
    }
    
}
