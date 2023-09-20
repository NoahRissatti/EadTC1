public class VerificaEntrada {
    public static String verificaEspacos(String inputString) {
        if (inputString.contains(" ")) {
            return inputString;
        } else {
            return "Erro";
        }
    }

    public static String verificaPossuiSeteNumeros(String inputString) {
        if (inputString.matches("\\d{7}")) {
            return inputString;
        } else {
            return "Erro";
        }
    }
}
