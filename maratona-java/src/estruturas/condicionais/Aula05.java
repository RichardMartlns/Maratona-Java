package estruturas.condicionais;

public class Aula05 {
    public static void main(String[] args) {
        /* imprima o dia da semana, considaderando 1 como domingo
         * switch = char, int, byte, short, enum, String
         */
        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
            System.out.println("Homem");
            break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        // com if não fica tão interessante

        if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        }

    }
}
