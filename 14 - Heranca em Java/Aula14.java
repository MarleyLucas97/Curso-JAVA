//Heranca e uma classe que herda uma caracteristica de outra classe.

public class Aula14 {
    public static void main(String[] args) {
        
        Aula14a carro = new Aula14a("Golf");
        Aula14a carro2 = new Aula14a("HRV");
        Aula14b carro3 = new Aula14b("Leopardo", 100);
        Aula14b carro4 = new Aula14b("Pantera", 50);

        carro3.atirar();
        carro3.atirar();
        carro3.atirar();
        carro3.atirar();
        carro4.sofrerDano(30);
        carro.sofrerDano(5);

        carro.info();
        carro2.info();
        carro3.info();
        carro4.info();
    }

    //criando um carro de combate pra herdar as caracteristicas de carro...

}
