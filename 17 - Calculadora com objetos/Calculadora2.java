import java.util.Scanner;

public class Calculadora2{
    static public void main(String[] args){

        Scanner leia = new Scanner(System.in);

        Numero n1 = new Numero(0);
        Numero n2 = new Numero(0);
        Numero res = new Numero(0);

       System.out.printf("Digite o primeiro numero: ");
       n1.setNumero(leia.nextInt());
       System.out.printf("Digite o segundo numero: ");
       n2.setNumero(leia.nextInt());
       res.setNumero(n1.getNumero()+n2.getNumero());
       
       System.out.prinf("%nA soma de %d com %d resulta em %d.",n1.getNumero(),n2.getNumero(),res.getNumero());
    }
}