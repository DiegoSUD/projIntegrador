package pinteg1;

import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a, b, c, x1, x2, d, R, B0, B, B1;
        System.out.println("Digite o valor de A: ");
        a = leitor.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = leitor.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = leitor.nextDouble();
        R = Math.pow(b, 2);
        d = R - (4 * a * c);
        System.out.println("Delta é igual a: " + d);
        if (d > 0) {
            System.out.println("Existem duas raízes diferentes");
            B0 = Math.sqrt(d);
            B = (-b + B0) / (2 * a);
            B1 = (-b - B0) / (2 * a);
            System.out.printf("A resposta é x1 = %.2f e x2 = %.2f \n ", B, B1);
        } else if (d == 0) {
            System.out.println("Existem duas raízes iguais");
            d = 1;
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            System.out.printf("A resposta é x1 = %.2f e x2 = %.2f \n ", x1, x2);
        } else {
            System.out.println("Não existe raiz real, então o resultado é" + d);
        }

    }

}
