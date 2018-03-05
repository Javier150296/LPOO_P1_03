package PaqueteClassesCap5;

import java.util.Scanner;
public class EventDemo {
    private static String NEvent;
    private static int numberOfGuest;
    private static String NEvent1;
    private static int numberOfGuest1;
    
    public static void  ejecutar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the event number");
        NEvent=in.nextLine();
        System.out.println("Enter the number of guest");
        numberOfGuest=in.nextInt();
        in.nextLine();
        System.out.println("Enter the event number 2");
        NEvent1=in.nextLine();
        System.out.println("Enter the number of guest 2");
        numberOfGuest1=in.nextInt();
        in.nextLine();
        Event object1 = new Event(NEvent, numberOfGuest);
        object1.display(numberOfGuest);
        Event object2 = new Event(NEvent1, numberOfGuest1);
        object2.display(numberOfGuest1);
        compare (object1, object2);
        
    }
    public static void compare(Event evento1, Event evento2){
         
        if(evento1.getGuest()==evento2.getGuest()){
            System.out.println("The events are same "+ evento1.getEventNumber()+ " and "+evento2.getEventNumber()+" and the number of guests are "+evento1.getGuest());
        }else if(evento1.getGuest()>evento2.getGuest()){
            System.out.println("The Larger event is"+ evento1.getEventNumber()+  " and the number of guests are "+ evento1.getGuest());
        }else {
            System.out.println("The Larger event is "+ evento2.getEventNumber()+ " and the number of guests are "+ evento2.getGuest());
        }
    }

        
    }
