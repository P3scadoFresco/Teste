import java.util.Scanner;

public class SORT {    

    public static boolean parada(int N, int M){

        boolean resultado = true;

        if(N == 0 && M == 0){
            resultado = false;
        }

        return resultado;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        while(parada(N, M)){

            int[] vetor = new int[N];

            for(int i = 0; i < N; i++){
                vetor[i] = scanner.nextInt();
            }

            


            N = scanner.nextInt();
            M = scanner.nextInt();
        }

        scanner.close();
    }

}
