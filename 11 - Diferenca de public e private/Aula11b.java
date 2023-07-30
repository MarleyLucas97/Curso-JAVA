public class Aula11b {
    //Ao tornar o modificador private ja nao se pode acessar o
    //atributo de fora da classe.

    private int num=0;
    private int vidas=0;

    public Aula11b(int num){
        //como trazer o num public para o num private dentro dessa classe
        //*this.num* e o atributo private da classe.
        this.num=num;
        this.vidas=3;
        System.out.printf("Jogador de numero %d criado%n", num);
    }
    
}
