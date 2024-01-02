//  Deus abençoe este código e quem vier a ler estas palávras. -Marley de Lucas, 02/01/2024.
//  "Como a mão do SENHOR, o meu Deus, esteve sobre mim, tomei coragem..." -Esdras 7:28

import java.util.Scanner;

public class Aula33 {

    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        char simboloAtual='x';
        Boolean game=true;
        String vitoria="";
        Scanner leia = new Scanner(System.in);

        iniciarJogo(velha);

        while(game==true){
            desenhaJogo(velha);
            vitoria=verificaVitoria(velha);
            if(!vitoria.equals(""));
            System.out.printf("Jogador %s venceu%n",vitoria);
            break;
        }
        try{
            if(verificarJogada(velha, jogar(leia, simboloAtual), simboloAtual)){
                if(simboloAtual='x'){
                    simboloAtual='o';
                }else{
                    simboloAtual='x';
                }
            }
        }catch(Exception e){
            System.out.println("Erro");
        }
        System.out.println("Erro");
    }

    //metodo que desenha o jogo...
    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.println("0   1   2");
        System.out.printf("0    %c | %c | %c%n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("1    %c | %c | %c%n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("2    %c | %c | %c%n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }
    public static void limparTela(){
        for(int cont=0;cont<200;cont++){
            System.out.println("");
        }
    }

    public static int[] jogar(Scanner leia, char sa){
        int p[] = new int[2];
        System.out.printf("%s %c %n","Quem joga: ", sa);
        System.out.print("Informe a linha: ");
        p[0]=leia.nextInt();
        System.out.print("Informe a coluna: ");
        p[1]=leia.nextInt();
        return p;
    }

    //metodo que verifica a jogada...
    public static Boolean verificarJogada(Campo[][] velha, int p[][], char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo()==' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    //metodo para iniciar o Jogo...
    public static void iniciarJogo(Campo[][] velha){
        for(int l=0; l<3; l++){
            for(int c=0;c<3;c++){
                velha[l][c] = new Campo();
            }
        }
    }

    //metodo que verifica a vitoria...
    public static String verificaVitoria(Campo[][] velha){
        return "";
    }
}