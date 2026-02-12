import java.util.Scanner;

public class IgnorarNumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        System.out.println("Digite um número (0 para sair): ");
        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                soma = soma + numero;
                contador++;
            } else {
                System.out.println("Esse numero é negativo e não pode ser somado!");
            }

            System.out.println("Digite outro número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("A soma dos total dos números digitados é de: " + soma);

        if (contador > 0) {
            double media = (double) soma / contador; // |"(double)"| É a proteção contra a divisão por 0!
            System.out.println("A média dos números positivos somados é de: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

        sc.close();
    }
}
