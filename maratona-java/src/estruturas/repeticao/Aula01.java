package estruturas.repeticao;

public class Aula01 {
    public static void main(String[] args) {
        // Estruturas simples:  while, do while, for

        // While trabalha com condições
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // do While vai ser executado pelo menos uma vez, independente de ser verdadeiro ou falso
        count = 0;
        do {
            System.out.println("Dentro do do-while"+ ++count);
        } while (count < 10);

        // for trabalha com indices
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
