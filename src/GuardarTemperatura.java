import java.util.Scanner;

public class GuardarTemperatura {
    public static double[] lerTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 7;
        double[] temperaturas = new double[tamanho];

        System.out.print("Digite as 7 temperaturas separadas por espaço: ");

        for (int i = 0; i < tamanho; i++) {
            temperaturas[i] = scanner.nextDouble();
        }

        scanner.close();
        return temperaturas;
    }
}