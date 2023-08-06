//implementar a interface e o termo correto mas o concento e o de heranca
public class Animal18 implements SerVivo18{
    //construtor...
    public Animal18(){}

    public void mover(){}
    public void comer(){}
    public void info(){
        System.out.printf("Vivo: %s",this.vivo ? "Sim" : "Nao");
    }
}
