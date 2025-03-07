import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = scanner.nextInt();

        if (numero%2==0) {
            System.out.println("Número PAR!!!");
        }else{
            System.out.println("Número ÍMPAR!!!");
        }
    }
}