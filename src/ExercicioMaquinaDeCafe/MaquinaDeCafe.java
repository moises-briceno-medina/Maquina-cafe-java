package ExercicioMaquinaDeCafe;

import ExercicioMaquinaDeCafe.Calculos.Calculos;
import ExercicioMaquinaDeCafe.constants.MensagensConstants;
import ExercicioMaquinaDeCafe.utils.ScanUtils;

import java.util.Arrays;
import java.util.List;

public class MaquinaDeCafe {
    public static void main(String[] args) {
        while (true) {
            SolucaoMaquinaDeCafe();
        }
    }

    private static void SolucaoMaquinaDeCafe() {
        ScanUtils scan = new ScanUtils();

        // lista de valores
        List<CardapioEnum> cardapio = Arrays.asList(
                CardapioEnum.CAPPUCCINO,
                CardapioEnum.VANILLA,
                CardapioEnum.MOCACCINO,
                CardapioEnum.CARIOCA,
                CardapioEnum.CHOCOLATE_QUENTE
        );

        System.out.println(MensagensConstants.MENSAGENS_MAQUINA.CARDAPIO);
        for (CardapioEnum item : cardapio) {
            System.out.println(item.toString());
        }

        //pede codigo e descobre valor
        String codigo = scan.coletaTexto(MensagensConstants.MENSAGENS_SCANNER.INFORME_CODIGO);
        double valor = 0;
        for (CardapioEnum item : cardapio) {
            if (item.getCodigo().equalsIgnoreCase(codigo.trim())) {
                valor = item.getValor();
            }
        }
        if (valor == 0) {
            System.out.println(MensagensConstants.MENSAGENS_MAQUINA.CODIGO_INVALIDO);
            return;
        }
        System.out.println(MensagensConstants.MENSAGENS_MAQUINA.VALOR_ESCOLHIDO + valor);

        //O usuário insere o dinheiro na máquina
        double dinheiro = scan.coletaDouble(MensagensConstants.MENSAGENS_SCANNER.INSIRA_DINHEIRO_MAQUINA);
        do {
            if (dinheiro < valor) {
                System.out.println(MensagensConstants.MENSAGENS_MAQUINA.VALOR_NAO_CORRESPONDENTE);
                dinheiro = scan.coletaDouble(MensagensConstants.MENSAGENS_SCANNER.INSIRA_OUTRO_VALOR);
            }
        } while (dinheiro < valor);

        if (dinheiro == valor) {
            preparacaoCafe();
        } else {
            Calculos.calcularTroco(valor, dinheiro);
            preparacaoCafe();
        }
    }
    private static void preparacaoCafe() {
        for (int i = 0; i < 2; i++) {
            System.out.println(MensagensConstants.MENSAGENS_MAQUINA.PREPARANDO_CAFE);
            try {
                Thread.sleep(3000); // espera 3 segundo
            } catch (
                    InterruptedException e) { //Thread.sleep() pode lançar uma exceção do tipo InterruptedException caso a thread em execução seja interrompida antes do final do tempo de espera.
                System.out.println(MensagensConstants.MENSAGENS_MAQUINA.ERRO_DE_PREPARACAO);
            }
        }
        System.out.println(MensagensConstants.MENSAGENS_MAQUINA.CAFE_PRONTO);
        System.out.println(MensagensConstants.MENSAGENS_MAQUINA.RETIRAR_CAFE);
    }
}