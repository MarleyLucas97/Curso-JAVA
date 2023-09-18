public class Aula31 {
//argumentos de entrada entram em args...
    public static void main(String[] args){

        //compilacao manual para entender as respostas do programa e seus parametros...
        int soma=0;
        if(args.length <=0){
            System.out.printf("%s%n", "Sem valores para somar.");
        }

        for(String n:args){
            int v=Integer.valueOf(n);
            soma+=v;
        }
        //esse programa recebe valores de fora...
        System.out.printf("Soma dos valores: %d%n", soma);
    }
}