abstract class Animal20 implements Ser20{

    private Boolean vivo;
    private int velocidade;
    private int massa;
    private int forca;
    private int x;
    private int y;

    public Animal20(int velocidade,int massa, int forca){
        this.vivo=true;
        this.velocidade=velocidade;
        this.massa=massa;
        this.forca=forca;
        this.x=0;
        this.y=0;
    }

    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }

    public Boolean getVivo(){
        return this.vivo;
    }

    public void setForca(int forca){
        this.forca=forca;
    }

    public int getForca(){
        return this.forca;
    }

    public void setMassa(int massa){
        this.massa=massa;
    }

    public int getMassa(){
        return this.massa;
    }
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    public void ataque(Animal20 a){
        if(this.vivo){
            if(this.forca > a.forca){
                a.vivo=false;
                System.out.println(this.getClass().toGenericString()+ " esta atacando...");
            }else{
                this.vivo=false;
            }
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode atacar");
            System.out.println("----------------------");
        }
    }
    
    public void mover(){
        if(this.vivo){
            this.x+=this.velocidade;
            this.y+=this.velocidade;
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode mover");
            System.out.println("----------------------");
        }
    };
    public void comer(Animal20 b){
        if(this.vivo){
            this.massa+=b.massa;
            this.forca+=b.forca;
            System.out.println(this.getClass().toGenericString()+ " esta comendo...");
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode comer");
            System.out.println("----------------------");
        }
    };
    public void info(){
        System.out.printf("%n Tipo.........:%s%n ", getClass().toString());
        System.out.printf("Vivo.........:%s%n ", this.getVivo() ? "Sim" : "Nao");
        System.out.printf("Massa........:%d%n ", this.massa);
        System.out.printf("Velocidade...:%d%n ", this.velocidade);
        System.out.printf("Forca........:%d%n ", this.forca);
        System.out.printf("-------------------------------%n");
    };
}
