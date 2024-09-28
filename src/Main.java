import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        //IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

        int num = 21;  // Você pode definir o número aqui ou receber entrada do usuário
        if (isFibonacci(num)) {
            System.out.println("1) O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("1) O número " + num + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("\n---------------------------");

        // 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
        //IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

        String str = "Exemplo de string com a letra a.";  // Você pode definir a string aqui
        verificarLetraA(str);

        System.out.println("\n---------------------------");

        // 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
        //Ao final do processamento, qual será o valor da variável SOMA?
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("3) Valor da variável SOMA: " + SOMA); // Resultado: 78

        System.out.println("\n---------------------------");

        // 4) Descubra a lógica e complete o próximo elemento:

        System.out.println("4a) Próximo elemento: 9"); // Sequência: 1, 3, 5, 7, 9
        System.out.println("4b) Próximo elemento: 128"); // Sequência: 2, 4, 8, 16, 32, 64, 128
        System.out.println("4c) Próximo elemento: 49"); // Sequência: 0, 1, 4, 9, 16, 25, 36, 49
        System.out.println("4d) Próximo elemento: 100"); // Sequência: 4, 16, 36, 64, 100
        System.out.println("4e) Próximo elemento: 13"); // Sequência: 1, 1, 2, 3, 5, 8, 13
        System.out.println("4f) Próximo elemento: 20"); // Sequência: 2, 10, 12, 16, 17, 18, 19, 20

        System.out.println("\n---------------------------");

        // 5) Método para descobrir a lógica dos interruptores e lâmpadas

        System.out.println("5) Para descobrir qual interruptor controla qual lâmpada:");
        System.out.println("   1. Ligue o primeiro interruptor e aguarde 10 minutos.");
        System.out.println("   2. Desligue o primeiro interruptor e ligue o segundo.");
        System.out.println("   3. Vá até as lâmpadas:");
        System.out.println("      - A lâmpada acesa é do segundo interruptor.");
        System.out.println("      - A lâmpada apagada e quente é do primeiro interruptor.");
        System.out.println("      - A lâmpada apagada e fria é do terceiro interruptor.");
    }

    // 1) Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == num || num == 0;
    }

    // 2) Função para verificar a existência da letra 'a' e contar suas ocorrências
    public static void verificarLetraA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        System.out.println("2) A letra 'a' aparece " + count + " vez(es) na string.");
    }
}