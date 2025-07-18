package estruturas.condicionais;

public class Aula03 {
    public static void main(String[] args) {
        /* Doar se salario > 5000
         * Operador ternario sempre vai associar um valor diretametne para uma variavel
         * Quando falado de metodo de retorno para o mesmo
         * Sintax (condicao) ? verdadeiro : falso;
        */

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // Forma simples

        double pagamento = 6000;
        String resposta = pagamento > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resposta);

        // Forma complexa : refazendo If / else if / else

        int idade = 20;
        String categoria;
        categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
