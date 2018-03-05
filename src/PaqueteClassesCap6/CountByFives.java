package PaqueteClassesCap6;
public class CountByFives {

    
    public static void  ejecutar() {
        for(int i=0;i<=200;i=i+5){
            System.out.printf(" "+i);
            if(i%50==0){
                System.out.println();
            }
        }
    }
    
}
