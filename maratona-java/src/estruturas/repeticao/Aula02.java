package estruturas.repeticao;

public class Aula02 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor. por exemplo, 50
        // break sai do laço de repetição

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
