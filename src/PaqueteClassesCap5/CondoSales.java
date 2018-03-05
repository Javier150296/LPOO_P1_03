package PaqueteClassesCap5;

import java.util.Scanner;
public class CondoSales {

    public static void  ejecutar() {
        Integer number;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Choose a number:\n1.- Park View\n2.- Glof Course View\n3.- Lake View: ");
	number = entrada.nextInt();
        if(number==1){
                System.out.println("Chosen View: Park view \nPrice Of the Condo: $150,000");
        }else if(number ==2){
                System.out.println("Chosen View: golf course views \nPrice Of the Condo: $170,000");
        }else if(number==3){
                System.out.println("Chosen View: Lake views \nPrice of The Condo: $210,000");
        }else{
                System.out.println("Chosen View: Incorrect \nPrice Of the Condo: $0");
        
        }
    }
    
}
