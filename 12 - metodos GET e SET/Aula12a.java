public class Aula12a {
    private final int maxVidas = 3;
    private int num=0;
    private int vidas=0;

    public Aula12a(int num){
        this.num=num;
        this.setVidas(1);
        System.out.printf("Jogador numero %d criado%n",num);
    }
    //metodo get para utilizar as variaveis private
    public int getVidas(){
        return this.vidas;
    }
    //adicionar vidas para o jogador...
    public void addVidas(){
            if(this.vidas < maxVidas){
                this.vidas++;
            }
        }
    //metodo set para controlar as variaveis private impondo limites
    private void setVidas(int vidas){
        if(vidas > maxVidas){
            this.vidas=maxVidas;
        }else if(vidas < 0){
            this.vidas=0;
        }else{
        this.vidas=vidas;
        }
        
    }
}
