//Neste caso Veiculo e a superclasse de aviao...
public class Aviao extends Veiculo{
    private int categoria;
    
    public Aviao(String nome, int categoria){
        //referencia direta a superclasse...
        super(nome,10);
        this.categoria=categoria;
    }
    //para fazer referencia ao info da superclasse e preciso chamar aqui...
    public void info(){
        super.info();
        System.out.printf("Categoria:%d%n",this.categoria);
    }
}
