// "Confie no SENHOR de todo coração, não dependa do seu próprio entendimento." -Provérbios, 3 : 5
// "Deus abençoe este codigo e quem vier a lê-lo." -Marley de Lucas, 22/01/2024 10:28
package Aula36;

import java.util.ArrayList;

public class Aula36 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");

        //É possível inserir um dado em determinada posição desejada...
        carros.add(1,"Argo"); //Adiciona o Argo à segunda posição... Lembre-se que a primeira posição é marcada pelo zero.

        carros.add(1,"Fusion"); //Colocando dois valores na mesma posição o segundo fica acima do primeiroe ambos ficam nessa posição 'um'.

        for(int e:numeros){
            System.out.println(e);
        }
        for(String c:carros){
            System.out.println(c);
        }
    }
}
