package PaqueteClassesCap5;

import java.util.Scanner;

public class RentalDemo {
    private static String ContNum1;
    private static int min1;
    private static String ContNum2;
    private static int min2;
    private static String ContNum3;
    private static int min3;
    
    public static void  ejecutar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Contract Number 1");
        ContNum1=in.nextLine();
        System.out.println("Enter the minutes 1");
        min1=in.nextInt();
        in.nextLine();
        Rental object1 = new Rental(ContNum1, min1);
        object1.display(min1);
        System.out.println("Enter the Contract Number 2");
        ContNum2=in.nextLine();
        System.out.println("Enter the minutes 2");
        min2=in.nextInt();
        in.nextLine();
        Rental object2 = new Rental(ContNum2, min2);
        object2.display(min2);
        System.out.println("Enter the Contract Number 3");
        ContNum3=in.nextLine();
        System.out.println("Enter the minutes 3");
        min3=in.nextInt();
        in.nextLine();
        Rental object3 = new Rental(ContNum3, min3);
        object3.display(min3);
         System.out.println();
         System.out.println("COMPARACION 1 Y 2");
        compare(object1, object2);
        System.out.println();
        System.out.println("COMPARACION 2 Y 3");
        compare(object2, object3);
        System.out.println();
        System.out.println("COMPARACION 1 Y 3");
        compare(object1, object3);
    }
    public static void compare(Rental x, Rental y){
        if(x.getMinutes()==y.getMinutes()){
            System.out.println("\nThe rental times are same "+ x.getContractNumber()+ "and "+y.getContractNumber()+" and the number of minutes are "+ x.getMinutes());
        }else if(x.getMinutes()>y.getMinutes()){
            System.out.println("The long time is"+ x.getContractNumber()+  "\n  and the number of minutes are "+ x.getMinutes() + " \n Hours :"+ x.getMinutes()/60+" \nMinutes "+x.getMinutes()%60);
        }else {
            System.out.println("The long time  is "+ y.getContractNumber()+ " \n and the number of minutes are "+ y.getMinutes()+ " \n Hours :"+ y.getMinutes()/60+" \nMinutes "+y.getMinutes()%60);
        }
    }

}
