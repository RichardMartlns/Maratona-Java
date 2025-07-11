package EstruturaCondicionais;

public class Aula1 {
    public static void main(String[] args) {

        int idade = 20;
        boolean IsAutorizadoComprarBebida = idade >= 18;

        if (IsAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida");
        }

        // if (!IsAutorizadoComprarBebida) o ! já esta afirmando que é falso, então não precisa fazer a comparação
        if (IsAutorizadoComprarBebida == false){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if(true){
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        // Não vai ser utilizado, apenas para saber que existe e que pode cair em provas de certificação
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

    }
}
