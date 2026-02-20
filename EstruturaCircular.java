import java.util.Scanner;

public class EstruturaCircular {

    public static int removeMaiorQueDez(int vetor[]){

        int tamanho = vetor.length;
        int resultado = 0;

        for(int i = 0; i < tamanho; i++){
            if (vetor[i] == 10);
                resultado = vetor[i];
            }

            return resultado;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int vetor[] = scanner.nextInt();

        for(int i = 0; i != '\0'; i++){
            vetor[i] = i;
        }

        scanner.close();
    }

}
