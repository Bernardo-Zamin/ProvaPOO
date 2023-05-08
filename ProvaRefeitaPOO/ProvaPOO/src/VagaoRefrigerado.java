public class VagaoRefrigerado extends Vagao{

    private int temp;

    public VagaoRefrigerado(String descricao, double capacidadeCarga, int temp){
        super(descricao, capacidadeCarga);
        this.temp = temp;

    }

    public int getTemperatura(){
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + ", temp= " + temp;
    }

    

}
