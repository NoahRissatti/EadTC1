import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @org.junit.Test
    public void testGuardarTemperaturas() {
        String input = "2 2 2 2 2 2 3";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        double[] temperaturas = GuardarTemperatura.lerTemperaturas();

        double[] expectedTemperaturas = { 2, 2, 2, 2, 2, 2, 3 };
        assertArrayEquals(expectedTemperaturas, temperaturas, 0.01);
    }

    @org.junit.Test
    public void testCalcularMedia() {
        double[] numeros = { 2, 2, 2, 2, 2, 2, 3 };

        double media = CalcularMedia.calcularMedia(numeros);

        double resultadoEsperado = 15.0 /7.0;
        assertEquals(resultadoEsperado, media, 0.001);
    }
}