public class Vagao {
    private int identificador;
    private String descricao;
    private double capacidadeCarga;
    private static int proxIdent = 1;

    public Vagao(String descricao, double capacidadeCarga){
        this.identificador = proxIdent;
        this.descricao = descricao;
        this.capacidadeCarga = capacidadeCarga;
        proxIdent = proxIdent + 1;
    }

    public Vagao(){
        this.identificador = proxIdent;
        this.descricao = "VagaoSemDescricao/Nome";
        this.capacidadeCarga = 5000.0;
        proxIdent = proxIdent + 1;
    }

    public int getIdentificador(){return identificador;}

    public String getDescricao(){return descricao;}

    public double getCapacidadeCarga(){return capacidadeCarga;}

    //public void setTrem(int id){this.trem = id;} assim foi como o Professor disponibilizou porem acredito que seja erro de digitacao
    //aqui esta como acredito que o professor gostaria de ter posto
    public void setTrem(int id){this.identificador = id;}

    public static int getProIdent(){
        return proxIdent;
    }

    public String toString(){
        return "\nTrem "+
                "descricao= " + descricao + ", " +
                "capacidadeCarga= " + capacidadeCarga + ", " +
                "identificador= " + identificador;
    }


}
