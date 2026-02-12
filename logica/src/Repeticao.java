import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite um número (0 para sair): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            contador++;
            System.out.println("Digite outro número (0 para sair):");
            numero = sc.nextInt();
        }
        System.out.println("Total de números digitados: " + contador);

        sc.close();
    }
}
