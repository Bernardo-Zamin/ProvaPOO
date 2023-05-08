import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CadastroVagoes {
    private ArrayList<Vagao> vagoes;

    public CadastroVagoes() {
        vagoes = new ArrayList<Vagao>();
    }

    public void cadastra(Vagao v) {
        vagoes.add(v);
    }

    public int qtdade() {
        return vagoes.size();
    }

    public Vagao getPorPosicao(int pos) {
        if (pos >= 0 && pos < vagoes.size()) {
            return vagoes.get(pos);
        } else {
            return null;
        }
    }

    public Vagao getPorId(int id) {
        for (Vagao vagao : vagoes) {
            if (vagao.getIdentificador() == id) {
                return vagao;
            }
        }
        return null;
    }

    public List<Vagao> getVagosPorPeso(int peso) {
        ArrayList<Vagao> aux = new ArrayList<Vagao>();
        for (Vagao vagao : vagoes) {
            if (peso <= vagao.getCapacidadeCarga()) {
                aux.add(vagao);
            }
        }

        Collections.sort(aux, new Comparator<Vagao>() {
            public int compare(Vagao v1, Vagao v2) {
                return v1.getDescricao().compareTo(v2.getDescricao());
            }
        });

        return aux;
    }

    @Override
    public String toString() {
        return "Todos os Vagoes Disponiveis " + vagoes;
    }

}
