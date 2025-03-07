import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int soma = 0;

        int contador = 0;
        do {
            System.out.println("NÚMERO: ");
            numero = scanner.nextInt();

            soma = soma+numero;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            contador++;
        } while (contador < 5);

        System.out.println("MAIOR NÚMERO: " + maiorNumero);
        System.out.println("MÉDIA: " + (soma)/5);
    }
}