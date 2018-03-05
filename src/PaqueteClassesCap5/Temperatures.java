package PaqueteClassesCap5;

import java.util.Scanner;
public class Temperatures {

    public static void  ejecutar() {

        Integer tempH, tempL;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Enter the high temperature C >> ");
	tempH = entrada.nextInt();
        System.out.println("Enter the low temperature C >> ");
	tempL = entrada.nextInt();

        if(tempH>=90){
            System.out.println("Heat warning");
        }
        if(tempL<32){
             System.out.println("Freeze warning");
        }
        if((tempH-tempL)>40){
             System.out.println("Large temperature swing.");
        }
    }
    
}
