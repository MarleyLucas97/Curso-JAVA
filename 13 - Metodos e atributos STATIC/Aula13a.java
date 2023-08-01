public class Aula13a {
    
    private final int maxVidas=3;
    private int num=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qtdJogadores=0;
    static int pontosJogadores=0;

    public Aula13a(int num){
        this.num=num;
        this.vidas=1;
        System.out.printf("Jogador numero %d criado%n",num);
        //propriedade static tambem se aplica aqui quando ele cria mais
        //um jogador ele adiciona um a qtd de jogadores e todos saem com o valor 
        //do calculo completo no terminal. 
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    static void pontos(){
        pontosJogadores+=10;
    }
    public void info(){
        System.out.printf("%nJogador:%d",this.num);
        System.out.printf("%nVidas:%d",this.vidas);
        System.out.printf("%nAlerta:%s",alerta ? "sim" : "nao");
        System.out.printf("%nJogadores:%d",qtdJogadores);
        System.out.printf("%nPontos:%d",pontosJogadores);
        System.out.printf("%n--------------------------------");
    }
}
