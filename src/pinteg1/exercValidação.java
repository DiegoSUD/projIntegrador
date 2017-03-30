package pinteg1;

import java.util.Scanner;

public class exercValidação {
    public static void main(String[] args) {
        /* Escreva um programa que lê um numero 
        entre 1 e 12 e mostra o seu dobro.Valide a entrada*/
        Scanner leitor = new Scanner(System.in);
        
        double num , dobro;
        
        System.out.println("------ Validação de Código ------ ");
        System.out.println("Digite um numero");
        num = leitor.nextDouble();
        if ((num >= 1) && (num <=12)){
            dobro = num *2;
            System.out.printf("O numero que digitou é %.2f é "
                    + "valido, e o dobro dele é %.2f \n ", num, dobro);
        }else{
            System.out.println("Código invalido");
        }
    }
    
}
