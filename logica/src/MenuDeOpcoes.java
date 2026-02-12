import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcao;

        /* do while executa e depois verifica */
        do {
            mostrarMenu();
            opcao = lerOpcao(sc);

            switch (opcao) {
                case 1:
                    System.out.println("\n--- SOMAR NÚMEROS POSITIVOS! ---");
                    somarNumerosPositivos(sc); // Chamar metodo
                    pausar(sc);
                    break;
                case 2:
                    System.out.println("\n--- CALCULAR MÉDIA (POSITVOS)! ---");
                    calcularMediaNumerosPositivos(sc);  // Chamar metodo
                    pausar(sc);
                    break;
                case 9:
                    mostrarAjuda();
                    pausar(sc);
                    break;
                case 0:
                    if (confirmarSaida(sc)) {
                        System.out.println("Saindo do sistema...");
                    } else {
                        opcao = -1; // Força continuar no menu
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    pausar(sc);
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

    private static void mostrarMenu() {
        System.out.println("\n====================");
        System.out.println("    MENU PRINCIPAL    ");
        System.out.println("====================");
        System.out.println("1 - Somar núemros positivos");
        System.out.println("2 - Calcular média (positivos)");
        System.out.println("9 - Ajuda");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Digite apenas NÚMEROS. Tente novamente: ");
            sc.next(); // Descarta o que foi digitado
        }
        return sc.nextInt();
    }

    private static boolean confirmarSaida(Scanner sc) {
        System.out.println("Tem certeza que deseja sair? (S/N): ");
        String resp = sc.next().trim().toUpperCase();
        return resp.equals("S");
    }

    private static void pausar(Scanner sc) {
        System.out.println("\n Pressione ENTER para voltar ao menu...");
        sc.nextLine(); // Limpa o "\n" pendente
        sc.nextLine(); // Espera Enter
    }

    private static void mostrarAjuda() {
        System.out.println("\n--- AJUDA ---");
        System.out.println("1: Você digita vários números, 0 encerra, Negativos são ignorados.");
        System.out.println("2: Calcula a média apenas dos números positivos digitados (0 encerra).");
        System.out.println("0: Sai do sistema (com confirmação).");
    }
}