package operadores;

public class Aula04 {
    public static void main(String[] args) {
        // Operador || (or)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean IsPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;


        System.out.println(IsPlaystationCincoCompravel);
    }
}
