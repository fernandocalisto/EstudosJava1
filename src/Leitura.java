import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme preferido: ");
        String filme = leitura.nextLine();

        System.out.println("Qual é a data de lançamento de " + filme + "?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual é a sua nota para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.printf("O seu filme preferido é: %s%n",filme);
        System.out.println("A data de lançamento de " + filme + " é: " + anoDeLancamento);
        System.out.println("A sua avaliação para o filme " + filme + " foi de: " + avaliacao);
    }
}
