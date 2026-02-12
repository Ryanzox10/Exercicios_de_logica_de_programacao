import java.util.Scanner;
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int soma = 0;
        //double media = soma / contador;

        System.out.println("Digite um número '0 para sair': ");
        int numero = sc.nextInt();

        while (numero != 0) {
            soma = soma + numero;
            contador++;
            System.out.println("Digite outro número '0 para sair': ");
            numero = sc.nextInt();
        }
        System.out.println("A soma dos números é de: " + soma);
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números somados é de: " + media);
        } else {
            System.out.println("Nenhum número foi digitado!");
        }

        sc.close();
    }
}