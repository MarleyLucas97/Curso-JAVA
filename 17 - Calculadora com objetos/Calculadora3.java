import java.util.Scanner;

public class Calculadora3 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        //Chama o Objeto
        Numero2 n1 = new Numero2();
        Numero2 n2 = new Numero2();
        Numero2 res = new Numero2();
        int alt = 1, opc = 0, opc2 = 1;

        while (opc == 1 || opc == 0) {

        do{System.out.println("Qual operacao deseja fazer? ");
        System.out.println("1-Soma      2-Subtracao     3-Multiplicacao     4-Divisao");
        alt= leia.nextInt();}while(alt<=0 || alt>=5);

        System.out.println("Digite o primeiro numero: ");
        n1.setNumero2(leia.nextInt());

        System.out.println("Digite o segundo numero: ");
        n2.setNumero2(leia.nextInt());

        switch (alt) {
            case 1:
                res.setNumero2(n1.getNumero2()+n2.getNumero2());
                System.out.printf("O resultado de %d somado com %d deu: %d.%n", n1.getNumero2(),n2.getNumero2(),res.getNumero2());
                break;
        
            case 2:
                res.setNumero2(n1.getNumero2()-n2.getNumero2());
                System.out.printf("O resultado de %d subtraido com %d deu: %d.%n", n1.getNumero2(),n2.getNumero2(),res.getNumero2());
                break;

            case 3:
                res.setNumero2(n1.getNumero2()*n2.getNumero2());
                System.out.printf("O resultado de %d multiplicado com %d deu: %d.%n", n1.getNumero2(),n2.getNumero2(),res.getNumero2());
                break;
            
            case 4:
                res.setNumero2(n1.getNumero2()/n2.getNumero2());
                System.out.printf("O resultado de %d dividido com %d deu: %d.%n", n1.getNumero2(),n2.getNumero2(),res.getNumero2());
                break;
            }

            do{System.out.printf("Deseja fazer outra operacao? %n1-S       2-N");
            opc=leia.nextInt();
            if(opc==2){
                    opc2=2;
                }else if(opc==1){
                        opc2=3;
                            }else{
                                opc2=1;
                                    }
                                    }while(opc2==1);
        }
        System.out.println("Fim do programa...");
    }
}