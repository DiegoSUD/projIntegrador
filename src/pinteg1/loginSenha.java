package pinteg1;

import java.util.Scanner;

public class loginSenha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o login : ");
        String login = leitor.nextLine();
        System.out.println("Digite o senha : ");
        String senha = leitor.nextLine();

        // para compara == numa String é o comando .equals
        // trim tira os espaços lado direito e esquerdo e os do meio não
        login = login.trim();
        senha = senha.trim();
        boolean autorizado = login.equals("diego") && senha.equals("0f5")
                || login.equals("barroso") && senha.equals("0706");
        if (autorizado) {
            System.out.println("Usuário autorizado");
        } else {
            System.out.println("Usuário não autorizado");
        }

    }

}
