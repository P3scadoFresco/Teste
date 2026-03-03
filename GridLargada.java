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

            

            System.out.println(cont);
        }

        scanner.close();
    }

}
