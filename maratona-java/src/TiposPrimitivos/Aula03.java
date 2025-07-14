package TiposPrimitivos;

public class Aula03 {
    public static void main(String[] args) {

       // forçar um casting, par aquele valor entrar porem ele corta para caber
        int idade = (int) 1000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        // Sempre usar F maiusculo, para que ele consiga identificar que tem espaço
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;

        System.out.println("A idade é"+idade+"anos");
    }
}
