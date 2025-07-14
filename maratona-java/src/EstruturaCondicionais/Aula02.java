package EstruturaCondicionais;

public class Aula02 {
    public static void main(String[] args) {

        /* idade  < 15 categoria juvenil
         * idade >= 15 && idade < 18 categoria juvenil
         * idade >= 18 categoria adulto
         */

        // Regra: todas as variaveis de escopo local tem que obrigatoriamente inicializadas antes de ser executadas.

        int idade = 17;
        // String categoria = ""; inicializada antes de executar pois ja esta guardando um valor vazio
       String categoria;

       if(idade < 15){
           categoria = "Categoria Infantil";
       }else if(idade >= 15 && idade < 18){
           categoria = "Categoria Juvenil";
       }else {
           categoria = "Categoria Adulto";
       }
        System.out.println(categoria);
    }
}
