public class Aula25 {
    public static void main(String[] args) {
        final int numCarros=5;
        Carro25[] Carros=new Carro25[numCarros];
        String[] modelo={"Civic","Golf","Camaro","Mustang","HB20"};

        for(int i=0;i<numCarros;i++){
            Carros[i]=new Carro25(modelo[i]);
        }

        for(Carro25 n:Carros){
            n.info();
        }
    }    
}