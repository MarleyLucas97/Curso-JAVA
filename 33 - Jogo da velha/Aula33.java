import java.util.Scanner;

public class Aula33 {

    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        char simboloAtual='x';
        Boolean game=true;
        String vitoria="";
        Scanner leia = new Scanner(System.in);

        while(game==true){

        }
    }

    //metodo que desenha o jogo...
    public static void desenhaJogo(Campo[][] velha){
        System.out.println("0   1   2");
        System.out.printf("0    %c | %c | %c%n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("1    %c | %c | %c%n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("-----------------");
        System.out.printf("2    %c | %c | %c%n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }
}