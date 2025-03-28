import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;

        while (nota >= 0) {
            System.out.print("Insira sua nota (Insira um número negativo para terminar): ");
            nota = leitura.nextDouble();
            if (nota < 0) {
                break;
            }
            media += nota;
            totalDeNotas++;
        }

        System.out.printf("A média total de notas para esse filme é %.2f%n",media / totalDeNotas);
    }
}
