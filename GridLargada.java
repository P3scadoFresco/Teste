import java.util.Scanner;

public class GridLargada {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){

            int N = scanner.nextInt();
            int[] largada = new int[N];
            int[] chegada = new int[N];

            for(int i = 0; i < N; i++){
                largada[i] = scanner.nextInt();
            }

            for(int i = 0; i < N; i++){
                chegada[i] = scanner.nextInt();
            }

            int cont = 0;

            for(int i = 0; i < N; i ++){
                for(int j = 0; j < N; j++){
                    if(largada[j] == chegada[j+i]){
                        cont = cont + i;
                    }
                }
            }

            System.out.println(cont);
        }

        scanner.close();
    }

}
