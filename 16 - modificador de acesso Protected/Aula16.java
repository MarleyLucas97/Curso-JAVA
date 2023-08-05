//modificador de acesso protected so permite o acesso de classes
//que estao no mesmo pacote ou que extenda a classe...

public class Aula16{
    public static void main(String[] args) {
        
        Aviao2 v2 = new Aviao2("Voador2", 1);

        v2.info();
    }
}