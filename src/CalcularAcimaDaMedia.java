public class CalcularAcimaDaMedia {
    public static double calcularAcimaDaMedia(double[] numeros,double media) {
        if (numeros.length == 0) {
            return 0.0;
        }

        double somaAcimaDaMedia = 0;

        for (double numero : numeros) {
            if (numero > media) {
                somaAcimaDaMedia += 1;
            }
        }
        return somaAcimaDaMedia;
    }
}
