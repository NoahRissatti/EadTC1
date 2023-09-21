public class VerificaEntrada {
    public static String verificarEntrada(String input) {
        String[] partes = input.split(" ");

        if (partes.length != 7) {
            return "Erro";
        }

        try {
            for (String parte : partes) {
                Double.parseDouble(parte);
            }
        } catch (NumberFormatException e) {
            return "Erro";
        }
        return input;
    }
}
