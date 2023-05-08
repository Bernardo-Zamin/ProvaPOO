import java.util.ArrayList;

public class Cardapio {

    private ArrayList<String> cardapio;

    public Cardapio() {
        cardapio = new ArrayList<String>();
    }

    public void add(String alimento){
        cardapio.add(alimento);
    }

    @Override
    public String toString() {
        return cardapio.toString();
    }

}
