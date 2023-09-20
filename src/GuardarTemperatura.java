import java.util.Scanner;

public class GuardarTemperatura {
    public static double[] lerTemperaturas(String temperaturasStr) {
        String[] temperaturasArray = temperaturasStr.split(" ");
        int tamanho = temperaturasArray.length;
        double[] temperaturas = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            temperaturas[i] = Double.parseDouble(temperaturasArray[i]);
        }

        return temperaturas;
    }
}