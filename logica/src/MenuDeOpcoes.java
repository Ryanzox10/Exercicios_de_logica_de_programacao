import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        /* do while executa e depois verifica */
        do {
            System.out.println("### MENU DE OPÇÕES ###");
            System.out.println("Opção 1: Somar números!");
            System.out.println("Opção 2: Calcular média!");
            System.out.println("Opção 0: Sair!");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu (Somar números)!");
                    somarNumerosPositivos(sc); // Chamar metodo
                    break;
                case 2:
                    System.out.println("Você escolheu (Calcular média)!");
                    calcularMediaNumerosPositivos(sc);  // Chamar metodo
                    break;
                case 0:
                    System.out.println("Saindo do sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    /* METODO */

    public static void somarNumerosPositivos(Scanner sc) {

        int soma = 0;

        System.out.println("Digite um número (0 para sair): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                soma += numero;
            }
            System.out.println("Digite outro número (0 para sair): ");
            numero = sc.nextInt();
        }
        System.out.println("A soma dos números é: " + soma);
    }


    public static void calcularMediaNumerosPositivos(Scanner sc) {
        int soma = 0;
        int contador = 0;

        System.out.println("Digite um número (0 para sair): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            soma += numero;
            contador++;
            System.out.println("Digite outro número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("A soma total dos números é: " + soma);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Você não digitou nenhum número!");
        }
    }
}