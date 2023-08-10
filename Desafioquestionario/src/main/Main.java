
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        String result = "";
        
        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Pergunta 1: ");
        System.out.println("Qual a maior estrela do nosso sistema solar?");
        System.out.println("a)Sol | b)Lua | c)Marte");
        String resposta1 = scan.nextLine();
        if (resposta1.equals("a")){
            nota += 2;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Pergunta 2: ");
        System.out.println("Qual a primeira letra do alfabeto?");
        System.out.println("a)B | b)A | c)W");
        String resposta2 = scan.nextLine();
        if (resposta2.equals("b")){
            nota += 2;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Pergunta 3: ");
        System.out.println("2 X 10 eh igual a?");
        System.out.println("a)10 | b)32 | c)20");
        String resposta3 = scan.nextLine();
        if (resposta3.equals("c")){
            nota += 2;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Pergunta 4: ");
        System.out.println("O fantastico mundo de______ (desenho antigo)");
        System.out.println("a)Bob | b)Adam | c)Winnit");
        String resposta4 = scan.nextLine();
        if (resposta4.equals("a")){
            nota += 2;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Pergunta 5: ");
        System.out.println("O valor aproximado de PI");
        System.out.println("a)2.14 | b)1.14 | c)3.14");
        String resposta5 = scan.nextLine();
        if (resposta5.equals("c")){
            nota += 2;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
       
        
        if(nota >= 6){
            result = "aprovado";
        }else {
            result = "reprovado";
        }
        
        System.out.println(nome + ", sua nota foi " + nota + " e voce foi " + result + "!");
        
        
        
        
        
        
        
              
        
       
    }
    
}
