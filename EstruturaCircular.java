import java.util.Scanner;

public class EstruturaCircular {

    public static int[] removeMaiorQueDez(int vetor[]){

        int tamanho = vetor.length;
        int resultado = -1;

        for(int i = 0; i < tamanho; i++){
            if (vetor[i] > 10){
                resultado = vetor[i];
            
                for(int j = i; j < tamanho - 1; j++){
                    vetor[j] = vetor[j+1];
                }
                vetor[tamanho - 1] = 0;
                System.out.println("valor removido: " + resultado);
                return vetor;
            }
        }

        System.out.println("valor nao encontrado");
        return vetor;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            vetor[i] = scanner.nextInt();
        }

        scanner.close();
    }

}
