//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.printf("O Filme foi lançado em %d, então é recente.%n",anoDeLancamento);
        }
        else {
            System.out.printf("Esse filme é de %d, então é antigo...%n", anoDeLancamento);
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("O filme está liberado para assistir!");
        }
        else {
            System.out.println("Deve pagar para assistir!");
        }

    }
}