package pinteg1;

import java.util.Scanner;

public class ContaTel {
    public static void main(String[] args) {
    /*Assinatura: R$ 23,32
    Ligações Locais: R$ 0,09 / min
    Ligações Interurbanas (DDD): R$ 0,26 / min
    Ligações Internacionais (DDI): R$ 0,86 / min
    Escreva um algoritmo que lê os minutos gastos
    em cada tipo de ligação e que mostra o valor a ser pago em
    cada um dos itens e, também, o valor total.*/
    
    Scanner leitor = new Scanner(System.in);
    
    double lL, r, lI,r1, lIN, r2, A, vT;
    
        
        System.out.println("Escreva os Minutos Gastos em Ligações locais: ");
        lL = leitor.nextDouble();
        System.out.println("Escreva os Minutos Gastos em Ligações "
                + "Interurbanas :");
        lI = leitor.nextDouble();
        System.out.println("Escreva Os Minutos Gastos em Ligações"
                + " Internacionais :");
        lIN = leitor.nextDouble();
        r = lL * 0.09;
        r1 = lI * 0.26;
        r2 = lIN * 0.86;
        A = 23.32;
        vT = r + r1 + r2 + A;
        System.out.println("---------------- CONTA TELEFONICA ---------------");
        System.out.printf(" Valor das Ligações Locais            %.2f \n",r);
        System.out.printf(" Valor das Ligações Interurbanas      %.2f \n " ,r1);
        System.out.printf("Valor das Ligações Internacionais    %.2f \n",r2);
        System.out.printf(" Assinatura                          %.2f \n ",A);
        System.out.printf("TOTAL FATURA                     R$ %.2f \n ",vT);
        
    }
    
}
