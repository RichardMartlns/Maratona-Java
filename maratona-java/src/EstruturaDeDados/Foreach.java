package EstruturaDeDados;

public class Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // foreach é uma forma simplificada do for
        for (int num : numeros3) {
            System.out.println();
        }
        /* basicamente assim que o foreach funciona por baixo dos panos
        int num = numeros3[0];
        System.out.println(num);
        num = numeros3[1];
        System.out.println(num);
        num = numeros3[2];
        System.out.println(num);
         */
    }
}
