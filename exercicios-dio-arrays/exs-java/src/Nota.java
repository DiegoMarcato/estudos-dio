import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("NOTA: ");
        nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("VALÍDO SOMENTE ENTRE 0 E 10");
            nota = scanner.nextInt();
        }
    }
}
