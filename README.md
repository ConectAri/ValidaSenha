# ValidaSenha

<h2>Enunciado:</h2>

Faça um código que solicite uma senha formada de 4 números inteiros, caso a senha esteja correta apresente a mensagem:

"Senha correta", caso contrário apresente a mensagem: "Senha inválida, tente novamente!"

Obs: a senha de comparação, você mesmo pode definir. E o programa termina somente quando a senha correta for digitada

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


<h2>Explicação:</h2>

O código começa definindo a senha de comparação como um número inteiro de 4 dígitos (9876, no caso).

Também é criada uma variável booleana "senhaCorreta" que inicialmente é false e será usada para indicar se a senha correta foi digitada.

Em seguida, é utilizado um loop "do-while" para solicitar a senha ao usuário e compará-la com a senha correta até que a senha correta seja digitada.

Dentro do loop, imprimimos uma mensagem pedindo para que o usuário digite a senha.

Em seguida, recebemos a tentativa de senha do usuário e a armazenamos na variável "tentativa".

Usamos um comando "if" para comparar a senha digitada com a senha correta.

Se a senha digitada for igual à senha correta, imprimimos uma mensagem de confirmação ("Senha correta") e alteramos o valor da variável "senhaCorreta" para true, indicando que a senha correta foi digitada.

Caso contrário, imprimimos uma mensagem de erro ("Senha inválida, tente novamente!") e o loop continua.

Quando a senha correta é digitada, a variável "senhaCorreta" é alterada para true, o loop é interrompido e o programa termina.

Por fim, fechamos o objeto da classe Scanner.

<h2>Resultado no Console:</h2>


Informe a senha (4 números inteiros): 8888

Senha inválida, tente novamente!

Informe a senha (4 números inteiros): 9999

Senha inválida, tente novamente!

Informe a senha (4 números inteiros): 9876


Senha correta, parabéns, você acertou!!!!
=========================================

