import java.util.Scanner;

public class SomaDeVariosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite um número (0 para sair): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            soma += numero;
            System.out.println("Digite outro número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }
}
