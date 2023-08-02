public class Aula14b extends Aula14a{
    private final int maxArmamento=100;
    private final int minArmamento=0;
    private int qtdArmamento;

    public Aula14b(String nome, int blindagem){
        //chama o construtor da classe pai...
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdArmamento=100;
    }

    public void setQtdArmamento(int qtdArmamento){
        this.qtdArmamento+=qtdArmamento;
        if(this.qtdArmamento>maxArmamento){
            this.qtdArmamento=maxArmamento;
        }
        if(this.qtdArmamento<minArmamento){
            this.qtdArmamento=minArmamento;
        }
    }

    public int getQtdArmamento(){
        return this.qtdArmamento;
    }

    public void atirar(){
        if(this.qtdArmamento>minArmamento){
            setQtdArmamento(-1);
        }else{
            System.out.println("Sem armamento");
        }
    }

    public void info(){
        super.info();
        System.out.printf("Qtd.de.Arm.............:%d%n",this.qtdArmamento);
    }
}

