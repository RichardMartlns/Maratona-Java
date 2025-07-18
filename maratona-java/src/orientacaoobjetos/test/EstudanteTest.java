package orientacaoobjetos.test;
import orientacaoobjetos.Estudante;

import java.sql.SQLOutput;

public class EstudanteTest {
    public static void main(String[] args) {
        // variavel de referencia do tipo Estudante que está fazendo referencia para um objeto do tipo Estudante

        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade =  14;
        estudante.sexo = 'M';


        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
