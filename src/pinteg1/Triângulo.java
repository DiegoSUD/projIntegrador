package pinteg1;

import java.util.Scanner;

public class Triângulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, c, A;
        System.out.println("Digite o valor do lado A: ");
        a = leitor.nextInt();
        System.out.println("Digite o valor do lado B: ");
        b = leitor.nextInt();
        System.out.println("Digite o valor do lado C: ");
        c = leitor.nextInt();
        System.out.println("Soma dos ângulos: ");
        A = leitor.nextInt();
        if ((a == b) && (a == c) && (b == c) && (A == 180)) {
            System.out.println("As medidas " + a + " e " + b + " e " + c + " com ângulo "
                    + "de " + A + " formam um triangulo equilátero ");
        } else if ((a == b) && (a != c) && (b != c)) {
            System.out.println("As medidas " + a + " e " + b + " e " + c + " com ângulo "
                    + "de " + A + " formam um triângulo isósceles ");
        } else if ((a != b) && (a != c) && (b != c)) {
            System.out.println("As medidas " + a + " e " + b + " e " + c + " com ângulo "
                    + "de " + A + " formam um triângulo escaleno ");
        } else if (A != 180) {
            System.out.println("As medidas " + a + " e " + b + " e " + c + " com ângulo "
                    + "de " + A + " não formam um triângulo");
        }
    }

}
