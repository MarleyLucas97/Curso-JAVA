public class If {
    public static void main(String[] args) {
        //altere os valores no codigo...
        int nota=5, media=7, faltas=0, maxFaltas=5;

        //Aplicacao do IF, else if e recurso AND && e OR ||
        if(nota>=media && faltas<=maxFaltas){
            System.out.println("O aluno foi aprovado");
        }else if(nota>4 && faltas<=maxFaltas){
            System.out.println("O aluno esta de recuperacao");
        }else{
            System.out.println("O aluno foi reprovado");
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
