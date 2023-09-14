import java.util.Scanner;

public class CalcularMedia {
    public static double calcularMedia(double[] numeros) {
        if (numeros.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.length;
        return media;
    }
}
