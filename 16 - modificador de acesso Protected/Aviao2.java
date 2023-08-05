//importando pasta...
import Veiculos.*;

public class Aviao2 extends Veiculo2{
    private int categoria;
    
    public Aviao2(String nome, int categoria){
        super(nome,10);
        this.categoria=categoria;
    }
    
    public void info(){
        super.info();
        System.out.printf("Categoria:%d%n",this.categoria);
    }
}
