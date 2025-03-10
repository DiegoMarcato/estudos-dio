import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual numero deseja: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int contador = 1; contador <= 10; contador++){
            System.out.println(tabuada + " x " + contador + " 2= " + tabuada*contador);
        }
    }
}
