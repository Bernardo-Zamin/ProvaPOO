public class VagaoRestaurante extends Vagao {
    private Cardapio cardapio;

    public VagaoRestaurante(String descricao, int capacidadeCarga, Cardapio cardapio) {
        super(descricao, capacidadeCarga);
        this.cardapio = cardapio;
    }

    public Cardapio getCardapio(Vagao v) {
        if (v instanceof VagaoRestaurante) {
            return cardapio;
        }
        return null;

    }

    public String toString() {
        return super.toString()+", Cardapio = "+cardapio;
    }

}
