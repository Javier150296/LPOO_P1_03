package PaqueteClassesCap6;


import java.util.Scanner;
public class CountByAnything {

    
    public static void  ejecutar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor a contar: ");
        int v = sc.nextInt();
        int cont=0;
        for(int i=0;i<=200;i=i+v){
            System.out.printf(" "+i);
            cont++;
            if(cont%10==0){
                System.out.println();
            }
        }
        System.out.println();
    }
    
}
