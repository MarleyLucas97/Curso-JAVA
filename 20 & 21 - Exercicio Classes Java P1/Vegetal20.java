public class Vegetal20 {

    private Boolean vivo;
    private int massa;
    
    public Vegetal20(int massa){
        this.vivo=true;
        this.massa=massa;
    }

    public void setMassa(int massa){
        this.massa=massa;
    }

    public int getMassa(){
        return this.massa;
    }

    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }
    public void info(){
        System.out.printf("Tipo.........:%s%n ", getClass().toString());
        System.out.printf("Vivo.........:%s%n ", this.vivo ? "Sim" : "Nao");
        System.out.printf("Massa........:%d%n ", this.massa);
        System.out.printf("-------------------------------");
    };
}
