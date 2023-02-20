
/*

Faça um código que solicite uma senha formada de 4 números inteiros,
caso a senha esteja correta apresente a mensagem:

"Senha correta", caso contrário apresente a mensagem: "Senha inválida, tente novamente!"

Obs: a senha de comparação, você mesmo pode definir.

E o programa termina somente quando a senha correta for digitada

 */

import java.util.Scanner;

public class ValidaSenha {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha = 5432;
        boolean senhaCorreta = false;

        do {
            System.out.print("Informe a senha (4 números inteiros): ");
            int tentativa = ler.nextInt();

            if (tentativa == senha) {
                System.out.println("========================================");
                System.out.println("Senha correta, parabéns, você acertou!!!");
                System.out.println("========================================");
                senhaCorreta = true;
            } else {
                System.out.println("Senha inválida, tente novamente!!!!!");
            }
        } while (!senhaCorreta);

        ler.close();
    }

}
