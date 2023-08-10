
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
      
        
        Scanner grava = new Scanner(System.in);
        /*
        System.out.println("Insira 3 valores que serao somados e multiplicados por 10");
        int valor1 = grava.nextInt();
        int valor2 = grava.nextInt();
        int valor3 = grava.nextInt();
        
        System.out.println((valor1+valor2+valor3)*10);
        
        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        
        System.out.println("informe um valor em reais:");
        
        double valor = grava.nextDouble();
        
        System.out.println((valor*0.94 + 10)/4);
        
        System.out.println("digite um nome e um numero inteiro");
        String nome = grava.nextLine();
        System.out.println("Agora o numero:");
        int numero = grava.nextInt();
        
        System.out.println(nome + " " + numero);*/
        
        System.out.println("CALCULANDO AUTONOMIA DE UM CARRO");
        System.out.println("informe a velociade media do veiculo em km/h");
        double velocidade = grava.nextDouble();
        System.out.println("agora o tempo de viagem em minutos");
        double tempo  = grava.nextDouble();
        
        double distancia = tempo/60 * velocidade;
        
        double litros = distancia/12;
        
        System.out.println(litros);
        
        
    }
    
}
