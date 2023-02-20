import java.util.Scanner;

public class OutraValidaSenha {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha = 9876;
        boolean senhaCorreta = false;

        do {
            System.out.print("Informe a senha (4 números inteiros): ");
            int tentativa = ler.nextInt();

            if (tentativa == senha) {
                System.out.println("=========================================");
                System.out.println("Senha correta, parabéns, você acertou!!!!");
                System.out.println("=========================================");
                senhaCorreta = true;
            } else {
                System.out.println("Senha inválida, tente novamente!");
            }
        } while (!senhaCorreta);

        ler.close();
    }
}
