package Operadores;

public class Aula2 {
    public static void main(String[] args) {
        // % = resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != Operadores Relacionais, sempre retorna valor boolean
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);


    }
}
