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
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                a.setVivo(false);
            }
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode atacar");
            System.out.println("----------------------");
        }
    };
    @Override
    public void info(){
        System.out.printf("%n Tipo.........:%s%n ", getClass().toString());
        System.out.printf("Vivo.........:%s%n ", this.getVivo() ? "Sim" : "Nao");
        System.out.printf("Massa........:%d%n ", this.getMassa());
        System.out.printf("Velocidade...:%d%n ", this.getVelocidade());
        System.out.printf("Forca........:%d%n ", this.getForca());
        System.out.printf("Veneno.......:%d%n",this.veneno);
        System.out.printf("-------------------------------%n");
    };
}