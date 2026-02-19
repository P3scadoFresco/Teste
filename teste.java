import java.util.Scanner;

//Teste de observaçao no github

public class teste {

    public static boolean fim(String palavra){

        boolean resultado = true;

        if(palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M'){
            resultado = false;
        }

        return resultado;
    }

    public static boolean palidromo(String palavra){

        int tamanho = palavra.length();
        boolean resultado = true;

        for(int i = 0; i < tamanho / 2; i++){
            if(palavra.charAt(tamanho - 1 - i) != palavra.charAt(i)){
                resultado = false;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine(); 

        while(fim(palavra)){

            if(palidromo(palavra)){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }

            palavra = scanner.nextLine();
        }

        scanner.close();
    }
}