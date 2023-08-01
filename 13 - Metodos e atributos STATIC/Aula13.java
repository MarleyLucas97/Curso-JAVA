//Static ele vai ser criado na memoria, ter aquela posicao
//pra todos os objetos dessa classe estarao no mesmo espaco de memoria
public class Aula13{
    public static void main (String[] args){

        int num=0;

        //foi possivel acessar a propriedade *alerta sem instaciar um objeto da classe
        System.out.printf("%nAlerta:%s%n",Aula13a.alerta ? "sim" : "nao");

        //a propriedade static aplica esses pontos para todos os jogadores.
        Aula13a.pontos();
        Aula13a.pontos();
        Aula13a.pontos();

        Aula13a j1 = new Aula13a(++num);
        Aula13a j2 = new Aula13a(++num);
        Aula13a j3 = new Aula13a(++num);

        //eles estao todos no mesmo endereco de memoria a troca do alerta modificou todos.
        Aula13a.alerta=true;

        j1.info();
        j2.info();
        j3.info();

    }
}