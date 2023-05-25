package ExercicioMaquinaDeCafe.Calculos;
public class Calculos {
    public static void calcularTroco(double valorASerPago, double valorPago) {
        int trocoEmCentavos = (int) Math.ceil((valorPago - valorASerPago) * 100);
        int[] notasEMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        System.out.printf("Seu troco é igual a R$ %.2f\n", (valorPago - valorASerPago));
        System.out.println("Troco:");
        for (int notasEMoeda : notasEMoedas) {
            int quantidade = (trocoEmCentavos / notasEMoeda);
            trocoEmCentavos = trocoEmCentavos % notasEMoeda;
            if (quantidade > 0) {
                if (notasEMoeda >= 100) {
                    System.out.println(quantidade + (notasEMoeda == 100 ? " moeda(s) de " : " nota(s) de ") + notasEMoeda / 100 + (notasEMoeda == 100 ? " real" : " reais"));
                }
                if (notasEMoeda < 100) {
                    System.out.println(quantidade + " moeda(s) de " + notasEMoeda + " centavos");
                }
            }
        }
    }
}
//criptografia
//textoCriptografado += (posicao == -1) ? caracter : letras.get((posicao + numRotacao) % letras.size()).charAt(0); //o método get() retorna uma string, então é necessário obter o primeiro caractere da string, utilizando o método charAt(0).
//if ternario
//descriptografia
// textoDescriptografado += (posicao == -1) ? caracter : (posicao - numRotacao < 0) ? letras.get(letras.size() + (posicao - numRotacao)).charAt(0) : letras.get((posicao - numRotacao) % letras.size()).charAt(0);