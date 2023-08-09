public class Arac21 extends Animal20 {
    private int veneno;

    public Arac21(int velocidade, int massa, int forca, int veneno){
        super(velocidade, massa, forca);
        this.veneno=veneno;
    }
    @Override
    public void ataque(Arac21 a){
        if(this.getVivo()){
            if(this.getForca() <= a.getForca()){
                this.setForca+=a.getMassa();
                
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                this.setForca(this.getForca()+a.getMassa());
                a.setVivo(false);
            }
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode atacar");
            System.out.println("----------------------");
        }
    }
}
