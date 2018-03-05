package PaqueteClassesCap5;


import java.util.Scanner;

public class EvenOdd {

    public static void  ejecutar() {
        Integer number;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter an integer >> ");
	number = entrada.nextInt();
        if((number%2)==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
		

    }
    
}
