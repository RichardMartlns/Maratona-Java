package operadores;

public class Aula05 {
    public static void main(String[] args) {
        // Operadores atribuição = += *= -= /= %=

        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // operadores de incremento ++ --

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        // colocar depois ele primeiro executa e depois incrementa
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);
    }
}
