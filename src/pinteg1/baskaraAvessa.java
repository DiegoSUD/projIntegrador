package pinteg1;

import java.util.Scanner;

public class baskaraAvessa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // ENTREDAS
        /* O comando  de texto para as variaveis double, ou int, ou String 
        usa-se ex: Double.parseDouble(console.nextLine())
        
        */ 
        
        System.out.print("x1: ");
        double x1 = Double.parseDouble(leitor.nextLine());
        System.out.print("x2 : ");
        double x2 = Double.parseDouble(leitor.nextLine());
        System.out.println("c : ");
        double c = Double.parseDouble(leitor.nextLine());
         
        //PROCESSAMENTOS
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(a * s);
 
        //SAÍDA
        System.out.println(a + "x² +" + b + "x + " + c + "= 0");
        
        
        
    }
    
    
}
