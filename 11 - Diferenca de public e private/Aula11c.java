public class Aula11c {
    public static void main(String[] args) {
        
        int num=0;
        //valores de incremento iniciam com zero, 
        //vamos tentar o pre-incremento
        /*Aula11b j1 = new Aula11b(num++);
        Aula11b j2 = new Aula11b(num++);
        Aula11b j3 = new Aula11b(num++);*/

        Aula11b j1 = new Aula11b(++num);
        Aula11b j2 = new Aula11b(++num);
        Aula11b j3 = new Aula11b(++num);

        //atributos public nao tem regras,
        //o private tem mais controle de regras dos atributos.
    }
    
}
