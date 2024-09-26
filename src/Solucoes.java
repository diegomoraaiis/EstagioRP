import java.util.Scanner;

public class Solucoes {

    // 1) Verifica se o número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }

    // 2) Verifica a quantidade de ocorrências de 'a' e 'A' em uma string
    public static int cLetraA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    // 3) Calcula o valor final de SOMA
    public static int caSoma() {
        int indice = 12, soma = 0, K = 1;
        while (K < indice) {
            K = K + 1;
            soma = soma + K;
        }
        return soma;
    }

    // 4) Completa as sequências
    public static void completarSequencias() {
        System.out.println("a)" + (7 + 2)); 
        System.out.println("b)" + (64 * 2));
        System.out.println("c)" + (Math.pow(7, 2)));
        System.out.println("d)" + (Math.pow(10, 2)));
        System.out.println("e)" + (5 + 8));
        System.out.println("f) " + 20);
    }


    public static void descobrirLampadas() {
        System.out.println("1. Ligue o primeiro interruptor e espere alguns minutos.");
        System.out.println("2. Desligue o primeiro interruptor e ligue o segundo.");
        System.out.println("3. Vá até a sala das lâmpadas:");
        System.out.println("- A lâmpada acesa pertence ao segundo interruptor.");
        System.out.println("- A lâmpada quente, mas apagada, pertence ao primeiro interruptor.");
        System.out.println("- A lâmpada apagada e fria pertence ao terceiro interruptor.");
    }

    public static void main(String[] args) {
        // 1) Verificação se o número pertence à sequência de Fibonacci
        try (Scanner scanner = new Scanner(System.in)) {
            // 1) Verificação se o número pertence à sequência de Fibonacci
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();
            if (isFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
            
            // 2) Verificação da quantidade de letras 'a' e 'A'
            scanner.nextLine(); // Consumir o newline
            System.out.print("Informe uma string para contar as ocorrências da letra 'a' ou 'A': ");
            String str = scanner.nextLine();
            int countA = cLetraA(str);
            System.out.println("A letra 'a' ou 'A' aparece " + countA + " vezes na string.");
            
            // 3) Cálculo da variável SOMA
            int soma = caSoma();
            System.out.println("O valor da variável SOMA após o processamento é: " + soma);
            
            // 4) Completar as sequências
            completarSequencias();
            
            // 5) Solução do problema dos interruptores e lâmpadas
            descobrirLampadas();
        }
    }
}