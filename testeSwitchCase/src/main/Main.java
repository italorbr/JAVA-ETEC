
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner grava = new Scanner(System.in);
        int op = 0;
        
        System.out.println("******ESCOLHA*******");
        System.out.println("1 - cadastro");
        System.out.println("2 - login");
        System.out.println("3 - sair");
        op = grava.nextInt();
        String user = "italo";
        int senha = 12345;
        String userLogin = "";
        int senhaLogin = 0;
        
        switch(op) {
            case 1:
                System.out.println("Informe seu usuario e depois a senha");
                System.out.println("Usuario: ");
                user = grava.next();
                System.out.println("Senha: ");
                senha = grava.nextInt();
                System.out.println("AGORA VOCE PODE EFETUAR LOGIN :D");
            
            
            case 2: 
                System.out.println("Informe seu usuario e depois a senha");
                System.out.println("Usuario: ");
                userLogin = grava.next();
                System.out.println("Senha: ");
                senhaLogin = grava.nextInt();
                
                if (user.equals(userLogin) && senha == senhaLogin){
                    System.out.println("LOGIN EFETUADO COM SUCESSO");
                } else {
                    System.out.println("USUARIO OU SENHA ERRADO");
            }
            break;
            
            case 3: 
                System.out.println("*****SAINDO*****");
            break;
                
            default: {
                System.out.println("opcao invalida xdxd");
            break;    
            }
           
            
                
        }
              
    }
    
}
