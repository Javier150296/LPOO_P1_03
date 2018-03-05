package PaqueteClassesCap6;

public class EverySum {

    public static void  ejecutar() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            for (int j = 0;j < i; j++)
                sum += 1 + j;
        System.out.println("Suma entre 1 y " + i + " = " + sum);
        sum = 0;
      }
    }
    
}
