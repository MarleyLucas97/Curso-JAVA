public class Aula03{
    public static void main(String[] args){

        //IF
        //Aciona a tomada de decisao quando cumpre os requisitos de uma expressao logica
        //Expressoes logicas: ==  >  <  >=  <=  !=  !   (True / False)

        int nota = 80, media = 60, faltas = 10, maxfaltas = 5;
        int res;


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