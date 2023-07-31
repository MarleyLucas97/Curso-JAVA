public class Aula12{
    public static void main(String[] args) {
        int num=0;

        Aula12a j1 = new Aula12a(++num);

        //ele nao ultrapaca o limite imposto pelo metodo set...
        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        System.out.printf("%nVidas do Jogador 1 = %d",j1.getVidas());
    }
}