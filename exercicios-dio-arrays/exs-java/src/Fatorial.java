import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        int fatorial = scanner.nextInt();
        
        System.out.print(fatorial + "! = ");
        int multiplicacao = 1;
        for(int contador = fatorial; contador >= 1; contador--){
            multiplicacao = multiplicacao*contador;
        }
        System.out.println(multiplicacao);
    }
}
