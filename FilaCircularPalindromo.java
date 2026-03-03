public class FilaCircularPalindromo {
    private char[] array;
    private int primeiro;
    private int ultimo;

    public FilaCircularPalindromo(int capacidade) {
        array = new char[capacidade];
        primeiro = ultimo = 0;
    }

    boolean isPalindromo(){

        boolean resultado = false;

        int inicio = primeiro;
        int fim = (ultimo - 1 + array.length) % array.length;
        int tamanho;

        return resultado;
    }
}