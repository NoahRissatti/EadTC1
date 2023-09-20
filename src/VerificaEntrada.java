public class VerificaEntrada {
    public static String verificarEspacos(String inputString) {
        if (inputString.contains(" ")) {
            return inputString;
        } else {
            return "Erro";
        }
    }
}
