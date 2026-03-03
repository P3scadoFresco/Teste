import java.util.Scanner;

public class SORT {    

    public static boolean parada(int N, int M){

        boolean resultado = true;

        if(N == 0 && M == 0){
            resultado = false;
        }

        return resultado;
    }

    public static boolean modulo(int a, int b, int M){

        boolean resultado = false;

        int moduloA = a % M;
        int moduloB = b % M;

        if(moduloA != moduloB){
            return moduloA < moduloB;
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

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(!modulo(vetor[j], vetor[j + 1], M)){
                        int aux = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = aux;
                    }
                }
            }

            for(int i = 0; i < N; i++){
                System.out.println(vetor[i]);
            }

            N = scanner.nextInt();
            M = scanner.nextInt();
        }

        scanner.close();
    }

}
