import java.util.Scanner;

public class Aula26a {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);

        String nome;
        final int numeroPerguntas=5;
        int nota=0, pontos=2;
        char[] respostas=new char[numeroPerguntas];
        String[] Perguntas={
            "Qual o maior astro do sistema solar? ",
            "Qual o valor de PI? ",
            "Quanto e 2x10? ",
            "Qual a primeira letra do alfabeto? ",
            "O Fantastico Mundo de ___. (Desenho dos anos 80)" 
            };
        String[] Alternativas={
            "a)Lua      b)Marte     c)Sol",
            "a)3.10     b)3     c)3.14",
            "a)20       b)40     c)100",
            "a)Z        b)A     c)W",
            "a)Zac      b)Bob       c)Joe"
            };
        char[] Gabarito={'c','c','a','b','b'};
        char resp;

        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();

        for(int i=0;i<numeroPerguntas;i++){
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n", Perguntas[i]);
            System.out.printf("%s%n", Alternativas[i]);
            resp=leia.nextLine().charAt(0);
            respostas[i]=resp;
        }
        System.out.printf("%s%n","Fim da prova, confira o resultado: ");
        for(int i=0;i<numeroPerguntas;i++){
            if(Gabarito[i]==respostas[i]){
                nota+=pontos;
            }
        }
        System.out.printf("%s, Sua nota foi %d. Voce foi %s.",nome,nota,nota>=6 ? "Aprovado" : "Reprovado");
    }
}