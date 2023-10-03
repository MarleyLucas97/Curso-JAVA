public class Campo {
    //o simbolo pode ser 3 instancias x, o ou vazio...
    private char simbolo;
    public Campo(){
        this.simbolo=' ';
    }
    public char getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(char simbolo) {
        //se o simbolo do campo estiver vazio ele ira receber o valor setado...
        if(this.simbolo == ' '){
            this.simbolo=simbolo;
        }else{
            System.out.println("Campo ja usado.");
        }
    }
}
