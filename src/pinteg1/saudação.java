package pinteg1;

import java.util.Scanner;

public class saudação {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            String nome;
            System.out.println("Escreva o nome da pessoa : ");
            nome = leia.next();
            // Não se pode colocar == "" ele reconhece ( coloca-se nome.equals)
            // para inverter a ordem colocase (!nome.equals (" "))
            
            if (nome.equals (" ")){
                System.out.println("Olá, mundo!");
            } else {
                System.out.println("Óla, " + nome + "!");
            }
         }
            
            
            
        
        
    }
    
}
