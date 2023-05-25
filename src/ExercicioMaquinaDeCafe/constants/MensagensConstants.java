package ExercicioMaquinaDeCafe.constants;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MensagensConstants {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MENSAGENS_MAQUINA {
        String CARDAPIO = "--------CARDAPIO--------";
        String CODIGO_INVALIDO = "Codigo invalido";
        String VALOR_ESCOLHIDO = "O valor do produto escolhido é R$";
        String VALOR_NAO_CORRESPONDENTE = "Você insiriu um valor menor do correspondente";
        String PREPARANDO_CAFE = "Preparando...";
        String ERRO_DE_PREPARACAO = "Ocorreu um erro ao esperar pelo café.";
        String CAFE_PRONTO = "Seu café está pronto!";
        String RETIRAR_CAFE = "Pode retirar seu pedido, obrigado pela compra😁";
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MENSAGENS_SCANNER {
        String INFORME_CODIGO = "Por favor, informe o código do produto";
        String INSIRA_DINHEIRO_MAQUINA = "Por favor, insira o dinheiro na máquina";
        String INSIRA_OUTRO_VALOR = "Por favor, insira um outro valor";
    }
}
