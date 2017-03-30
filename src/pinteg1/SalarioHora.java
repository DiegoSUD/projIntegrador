package pinteg1;

import java.util.Scanner;

public class SalarioHora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        double vH, qH, s;
        System.out.println("Escreva o nome do funcionario: ");
        nome = leitor.next();
        System.out.println("Escreva o valor da hora hora trabalhada: ");
        vH = leitor.nextDouble();
        System.out.println("Escreva quantas hora ele trabalhou no mês : ");
        qH = leitor.nextDouble();
        s = vH * qH;
        System.out.printf("O funcionário %s trabalhou %.0f horas por "
                + "R$ %.2f e deve receber R$ %.2f \n", nome, qH, vH, s);

    }

}
