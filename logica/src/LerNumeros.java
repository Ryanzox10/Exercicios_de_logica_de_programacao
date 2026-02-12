import java.util.Scanner;

public class LerNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 10) {
            System.out.println("O número é maior que 10!");
        } else if (numero == 10) {
            System.out.println("O número é 10!");
        } else {
            System.out.println("O número é menor que 10!");
        }
        sc.close();
    }
}
