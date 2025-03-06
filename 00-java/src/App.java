import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = sc.nextLine();
        System.out.println("Olá " + name);

        System.out.println("Quantos anos você tem?");
        int age = sc.nextInt();
        System.out.println("Você tem " + age);
        sc.close();
    }
}