import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as temperaturas separadas por espaço: ");
        String temperaturasStr = scanner.nextLine();

        String inputVerificado = VerificaEntrada.verificarEntrada(temperaturasStr);

        if ("Erro".equals(inputVerificado)) {
            System.out.println("Erro");
        } else {
            double[] temperaturas =  GuardarTemperatura.lerTemperaturas(inputVerificado);

            double media = CalcularMedia.calcularMedia(temperaturas);
            double temperaturasAcima = CalcularAcimaDaMedia.calcularAcimaDaMedia(temperaturas, media);
            System.out.println(temperaturasAcima);
        }

        scanner.close();
    }}