import java.util.Scanner;

public class Calculadora2{
    static public void main(String[] args){

        Scanner leia = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc="S";

        while(opc.equals("s") || opc.equals("S")){
       
            System.out.printf("Digite o primeiro numero: ");
            n1.setNumero(leia.nextInt());
            System.out.printf("Digite o segundo numero: ");
            n2.setNumero(leia.nextInt());
            res.setNumero(n1.getNumero()+n2.getNumero());
       
            System.out.printf("%nA soma de %d com %d resulta em %d.",n1.getNumero(),n2.getNumero(),res.getNumero());
            System.out.printf("%nDeseja fazer outra operacao? ");
            opc=leia.next();
            System.out.printf("%n%n%n");
    }
    
    System.out.println("Fim do programa...");
    
    }
}