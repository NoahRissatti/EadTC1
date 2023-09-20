import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as temperaturas separadas por espaço: ");
        String temperaturasStr = scanner.nextLine();

        double[] temperaturas = GuardarTemperatura.lerTemperaturas(temperaturasStr);

        double media = CalcularMedia.calcularMedia(temperaturas);
        double temperaturasAcima = CalcularAcimaDaMedia.calcularAcimaDaMedia(temperaturas,media);
        System.out.println(temperaturasAcima);

        scanner.close();
    }}