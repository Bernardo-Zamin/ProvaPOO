public class App {
    public static void main(String[] args) throws Exception {
        Vagao v1 = new Vagao("Tremzinho",100.0);
        Vagao v2 = new Vagao("Tremzao",2000.0);
        Vagao v3 = new Vagao();
        VagaoRefrigerado vr = new VagaoRefrigerado("ColdTrain", 3000.0, 25); // nomes aleatorios apenas para teste de ordenacao
        VagaoRefrigerado vr1 = new VagaoRefrigerado("ColdestTrain", 4000.0, 55);
        CadastroVagoes cadastro = new CadastroVagoes();
        Cardapio cardapio = new Cardapio();
        VagaoRestaurante restaurante = new VagaoRestaurante("Hambuergueria", 6000, cardapio);

        cardapio.add("Suco");
        cardapio.add("Burguer");
        cardapio.add("Refrigerante");
        cardapio.add("Fritas");


        cadastro.cadastra(v1);
        cadastro.cadastra(v2);
        cadastro.cadastra(v3);
        cadastro.cadastra(vr);
        cadastro.cadastra(vr1);
        cadastro.cadastra(restaurante);
        
        
        System.out.println("\nGETCARDAPIO() " + restaurante.getCardapio(restaurante));
        System.out.println("\nGETVAGOESPORPESO()"+ cadastro.getVagosPorPeso(500));
        System.out.println("\nGETPORID()" + cadastro.getPorId(1));

        System.out.println("\n"+cadastro);
        
        //Questao 5: Sim, é possivel por conta do polimorfismo. Um exemplo é a o metodo "getPorId()" que utilizada uma instancia de Vagao,getIndentificador().
        //e como a classe VagaoRefrigerado é uma subclasse de Vagao é possivel sim utilizar as instancias de VagaoRefrigerado,como getTemperatura()
        //para alguma condicao

        
        //8. a.Sim há herenca, como exemplo Vagao com VagaoRefrigerado,pois VagaoRefrigerado usa "super" no construtor e "toString" por exemplo
        //   b.Sim ha plimorfismo, pois o "super" como dito na resposta "a" é uma maneira de utilizar metodos de uma superclasse, sendo a classe filho
        //       ocorrendo apenas algumas mudancas, assim como no sentido literal da palavra.
        //   c.Sim existe sobrecarga no metodo vagao pois sao dois metodos com nomes iguais porem com parametros diferentes, um com parametros
        //       e outro sem parametros.
        //   d.Tem utilizacao de metodos repitidos,como "toString()" de um super para uma subclasse
        //   e. Nao há presenca de interface.

    }

}
