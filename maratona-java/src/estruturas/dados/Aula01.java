package estruturas.dados;

public class Aula01 {
    public static void main(String[] args) {

        /* array Tipo [] nome; ele referencia um valor na memoria
         * Somente variaveis tipo referencia pode iniciar como null: String, aaray
         * o indice sempre começa de 0 pois sao indexados na memoria, arrays sao considerados objetos
         */

        int [] idades = new int[3];
        idades[0] = 12;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
    }
}
