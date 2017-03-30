package pinteg1;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        double p, a, IMC, r, A;

        System.out.println("Qual o seu nome: ");
        nome = leitor.next();
        System.out.println("Qual o seu peso: ");
        p = leitor.nextDouble();
        System.out.println("Qual a sua altura: ");
        a = leitor.nextDouble();
        A = Math.pow(a, 2);
        IMC = p / A;
        System.out.printf("Seu IMC é %.2f \n", IMC);
        if (IMC < 18.5) {
            System.out.printf("%s está com Índice de"
                    + " Massa Corporal %.2f está - Abaixo do Peso \n", nome ,IMC);
        } else if ((IMC <= 18.5) && (IMC < 25)) {
            System.out.printf("%s está com Índice "
                    + "de Massa Corporal %.2f está - Peso Normal \n",nome, IMC);
        } else if ((IMC <= 25) && (IMC < 30)) {
            System.out.printf("%s está com Índice "
                    + "de Massa Corporal %.2f está - Acima do Peso \n", nome, IMC);
        } else {
            System.out.printf("%s está com Índice "
                    + "de Massa Corporal %.2f está - Obeso \n", nome, IMC);
        }

    }

}
