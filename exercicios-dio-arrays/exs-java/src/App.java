import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("NOME: ");
            nome = scanner.next();
            if (nome.equals("0")) {
                break;
            }
            System.out.println("IDADE: ");
            idade = scanner.nextInt();
        }
    }
}