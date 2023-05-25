package ExercicioMaquinaDeCafe.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

public class ScanUtils {
    private Scanner scanner = new Scanner(System.in);

    public String coletaTexto(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public double coletaDouble(String mensagem) {
        System.out.println(mensagem);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.next();
            System.out.println(MENSAGENS.VALOR_INVALIDO);
            return coletaDouble(mensagem);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MENSAGENS {
        String VALOR_INVALIDO = "Valor inválido, informe um novo valor.";
    }
}