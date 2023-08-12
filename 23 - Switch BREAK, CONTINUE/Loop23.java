public class Loop23 {
    public static void main(String[] args) {
        int cont=100;
        int i=0;

        for(i=0;cont>i;i++){
            if(i>=10 && i<=60){
            continue;
            }
            System.out.printf("%d - ",i);
        }
    }
}
