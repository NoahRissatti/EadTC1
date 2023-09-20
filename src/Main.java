import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as temperaturas separadas por espaço: ");
        String temperaturasStr = scanner.nextLine();

        String inputVerificado = VerificaEntrada.verificaEspacos(temperaturasStr);
        double[] temperaturas = (double[]) GuardarTemperatura.lerTemperaturas(inputVerificado);

        double media = CalcularMedia.calcularMedia(temperaturas);
        double temperaturasAcima = CalcularAcimaDaMedia.calcularAcimaDaMedia(temperaturas,media);
        System.out.println(temperaturasAcima);

        scanner.close();
    }}