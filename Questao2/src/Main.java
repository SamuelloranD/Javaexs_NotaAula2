import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double distancia = sc.nextInt();
        System.out.println("Digite o tempo de espera: ");
        int espera = sc.nextInt();
        System.out.println("Qual a tarifa base? ");
        double tarifaBase = sc.nextDouble();
        System.out.println("Qual o valor do fator demanda? ");
        double demanda = sc.nextDouble();

        Uber uber = new Uber(distancia, tarifaBase, demanda, espera);

        uber.exibirDetalhes();

        sc.close();
    }
}