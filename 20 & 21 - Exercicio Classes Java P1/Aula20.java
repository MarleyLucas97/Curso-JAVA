//falta corrigir algumas partes do codigo que estao dando resultados um pouco diferentes
public class Aula20{
    public static void main(String[] args) {
        
        Anf21 Sapo = new Anf21(10, 10, 10);
        Arac21 Aranha = new Arac21(5, 5, 5, 3);
        Inseto20 Formiga = new Inseto20(2, 2, 2);
        Vegetal20 Abobora = new Vegetal20(10);
        Vegetal20 Cenoura = new Vegetal20(5);
        Vegetal20 Alface = new Vegetal20(1);

        Aranha.info();
        Aranha.ataque(Formiga);
        //Formiga.mover();
        Aranha.info();

        //System.out.println(Formiga.getVivo());
    }
}