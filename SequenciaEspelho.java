import java.util.Scanner;

public class SequenciaEspelho{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int maior;
        int menor;

        if(numero1 > numero2){
            maior = numero1;
            menor = numero2;
        }else if(numero2 > numero1){
            maior = numero2;
            menor = numero1;
        }else{
            maior = numero1;
            menor = numero2;
        }

        int tamanho = (((maior - menor) * 2) + 2);
        int[] vetor = new int[tamanho];

        for(int i = 0; i < tamanho / 2; i++){
            vetor[i] = menor;
            menor++;
        }

        for(int i = tamanho / 2; i < tamanho; i++){
            vetor[i] = maior;
            maior--;
        }

        for(int i = 0; i < tamanho; i++){
            System.out.print(vetor[i]);
        }

        scanner.close();
    }

}