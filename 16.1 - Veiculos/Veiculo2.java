//informativo de pasta...
package Veiculos;

public class Veiculo2 {
    protected String nome;
    protected int tipo;

    public Veiculo2(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }
    public void info(){
        System.out.printf("Nome:%s%n",this.nome);
        System.out.printf("Tipo:%d%n",this.tipo);
    }
}
