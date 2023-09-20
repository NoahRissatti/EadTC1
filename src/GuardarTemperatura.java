import java.util.Scanner;

public class GuardarTemperatura {
    public static Object lerTemperaturas(String temperaturasStr) {
        if (!temperaturasStr.contains(" ")) {
            return "Erro";
        }

        String[] temperaturasArray = temperaturasStr.split(" ");
        int tamanho = temperaturasArray.length;
        double[] temperaturas = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            temperaturas[i] = Double.parseDouble(temperaturasArray[i]);
        }

        return temperaturas;
    }
}