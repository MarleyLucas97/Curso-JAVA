public class Aula03{
    public static void main(String[] args){

        //IF
        //Aciona a tomada de decisao quando cumpre os requisitos de uma expressao logica
        //Expressoes logicas: ==  >  <  >=  <=  !=  !   (True / False)

        /*int nota = 80, media = 60, faltas = 10, maxfaltas = 5;*/
        /*String res; */
        /*int res;*/
        int pos = 7;


        /*if(nota>=media && faltas<=maxfaltas){
            System.out.println("Aprovado");
        }else if(nota>=40 && faltas<=maxfaltas){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do programa...");*/

        /*res=(nota>=media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);*/

        /*res=(nota>=media ? 0 : 1);
        System.out.println("Resultado: " + (res==1?"Aprovado":"Reprovado"));*/

        switch (pos) {
            case 1:
                System.out.println("Primeiro lugar.");
                break;
            case 2:
                System.out.println("Segundo lugar.");
                break;
            case 3:
                System.out.println("Terceiro lugar.");
                break;
            case 4: case 5: case 6:
                System.out.println("Ganhou um premio de participacao.");
                break;
            default:
                System.out.println("Nao ganhou premio.");
                break;
        }

        //Tabela da verdade para AND &&
        /*
            VV = V
            VF = F
            FV = F
            FF = F
        */
        //Tabela da verdade para OR ||
        /*
            VV = V
            VF = V
            FV = V
            FF = F
        */
    }
}