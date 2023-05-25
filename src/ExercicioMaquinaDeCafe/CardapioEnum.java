package ExercicioMaquinaDeCafe;

//A maquina deve possuir o seguinte cardápio:
// • Cappuccino:
//valor: 4:50
//code: A50
//• Vanilla:
//valor: 5:00
//code: B40
//• Mocaccino:
// valor: 3:75
// code: A60
//• Carioca:
// valor: 2:20
//code: M20
//• chocolate quente:
//valor: 8:40
//code: C10
public enum CardapioEnum {
    CAPPUCCINO("Cappuccino", "A50",4.50),
    VANILLA ("Vanilla","B40",5),
    MOCACCINO("Mocaccino","A60",3.65),
    CARIOCA("Carioca","M20",2.20),
    CHOCOLATE_QUENTE("Chocolate Quente","C10",8.40);

    private String nome;
    private String codigo;

    private double valor;

    CardapioEnum(String nome, String codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }
    public String toString() {
        return nome+"\n\tCódigo: "+codigo+"\n\tValor R$: "+valor+"";
    }
}
