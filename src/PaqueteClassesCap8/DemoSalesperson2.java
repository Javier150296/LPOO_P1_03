package PaqueteClassesCap8;

public class DemoSalesperson2 {

        public static void  ejecutar() {
        Salesperson[] s = new Salesperson[10];
        Integer nu =111;
        double ven= 25000.0;
        for(int i=0;i<10;i++){
            s[i]= new Salesperson(nu, ven);
            nu = nu + 1;
            ven = ven + 5000.0;
        }

        for(int i=0;i<10;i++){
            System.out.println("vendedor "+(i+1)+": "+ s[i].getNoIdentificacion()+"   "+s[i].getVentas());
        }
    }
    
}
