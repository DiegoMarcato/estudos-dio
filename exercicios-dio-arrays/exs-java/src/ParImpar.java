import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numeros;
        int quantDePares = 0;
        int quantDeImpares = 0;
        

        System.out.println("Quantos números você deseja: ");
        quantNumeros = scanner.nextInt();

        int contador = 0;
        do{
            System.out.println("Nùmero: ");
            numeros = scanner.nextInt();

            if (numeros % 2 == 0) {
                quantDePares++;
            }else{
                quantDeImpares++;
            }

            contador++;
        }while(contador < quantNumeros);

        System.out.println("Números Pares: " + quantDePares);
        System.out.println("Números Impares: " + quantDeImpares);

    }
}