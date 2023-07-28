public class Aula09b {
    public static void main(String[] args) {
        msg("Soma: ", 1);
        System.out.println(soma(1,5,4,77,4));
        System.out.println(soma(2.5,2.5));
        
    }
    //quando for preciso passar uma lista de valores inderteminadas quantidades
    //esse e o metodo.
    //sobrecarga de metodos: int e double 
    public static int soma(int... numeros){
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }
    public static double soma(double... numeros){
        double res=0.0;
        for(double n:numeros){
            res+=n;
        }
        return res;
    }
    public static void msg(String m, int l) {
        for(int i=0;i<l;i++){
        System.out.println(m);
        }
    }
}
