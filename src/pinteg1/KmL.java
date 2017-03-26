package pinteg1;

import java.util.Scanner;

public class KmL {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double qI, qF, lI, lF, Rq, Rl, R;
        System.out.print("Escreva a quilometragem "
                + "atual no ato do abastecimento :");
        qI = leitor.nextDouble();
        System.out.print("Encha o tanque e anote a quantidade de litros  :");
        lI = leitor.nextDouble();
        System.out.print("Escreva a quilometragem na "
                + "segunda vez que está abastencendo: ");
        qF = leitor.nextDouble();
        System.out.print("Encha o tanque pela "
                + "segunda vez e anote a quantidade de litros: ");
        lF = leitor.nextDouble();
        
        Rq = qF - qI;
        Rl = lI - lF;
        R = Rq / Rl;
        System.out.println("-----Seu carro faz: " + R + "Km/l-----");
        
    }
    
}
