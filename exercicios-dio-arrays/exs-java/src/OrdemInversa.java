public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor ={0,1,2,3,4,5};

        int contador = 0;
        System.out.print("VETOR NORMAL: ");
        while (contador < vetor.length) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVETOR INVERSA: ");
        for(int contador02 = (vetor.length - 1); contador02 >= 0; contador02-- ){
            System.out.print(vetor[contador02] + " ");
        }
    }
}