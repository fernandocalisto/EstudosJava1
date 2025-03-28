import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        double avaliacao;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a sua avaliação para o filme:");
            avaliacao = leitura.nextDouble();
            media += avaliacao;
        }

        System.out.printf("A média das 3 avaliações é: %.2f%n",media/3);
    }
}
