import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @org.junit.jupiter.api.Test
    public void testGuardarTemperaturas() {
        String input = "2 2 2 2 2 2 3";

        double[] temperaturas = (double[]) GuardarTemperatura.lerTemperaturas(input);

        double[] expectedTemperaturas = { 2, 2, 2, 2, 2, 2, 3 };
        assertArrayEquals(expectedTemperaturas, temperaturas, 0.01);
    }

    @org.junit.jupiter.api.Test
    public void testGuardarTemperaturasSemEspacoEntre() {
        String input = "2222223";

        String temperaturas = (String) GuardarTemperatura.lerTemperaturas(input);

        String expectedMessage = "Erro";
        assertEquals(expectedMessage, temperaturas);
    }

    @org.junit.jupiter.api.Test
    public void testCalcularMedia() {
        double[] numeros = { 2, 2, 2, 2, 2, 2, 3 };

        double media = CalcularMedia.calcularMedia(numeros);

        double resultadoEsperado = 15.0 /7.0;
        assertEquals(resultadoEsperado, media, 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testCalcularAcimaDaMedia() {
        double[] numeros = { 2, 2, 2, 2, 2, 2, 3 };

        double media = 15.0 /7.0;

        double resultadoEsperado = 1;
        double resultadoObtido = CalcularAcimaDaMedia.calcularAcimaDaMedia(numeros,media);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testReceberArrayERetornarNumeroAcimaDaMedia() {
        String input = "2 2 2 2 2 2 3";

        double[] temperaturas = (double[]) GuardarTemperatura.lerTemperaturas(input);
        double media = CalcularMedia.calcularMedia(temperaturas);
        double resultadoObtido = CalcularAcimaDaMedia.calcularAcimaDaMedia(temperaturas,media);

        double resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }
}