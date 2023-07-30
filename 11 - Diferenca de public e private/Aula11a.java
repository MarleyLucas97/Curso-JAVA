public class Aula11a {
    public static void main(String[] args) {
        
        Aula11 j1 = new Aula11(1);
        Aula11 j2 = new Aula11(2);

        //estamos acessando e modficando os valores de 
        //*num* de fora da classe.
        j1.num=10;
        j2.num=5;
        System.out.printf("%n%d",j1.num);
        System.out.printf("%n%d",j2.num);
    }

    
}
