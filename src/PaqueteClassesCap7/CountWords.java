package PaqueteClassesCap7;


import java.util.Scanner;

public class CountWords {

    public static void  ejecutar() {
        Scanner entrada= new Scanner(System.in);
        String cadena;
        int cont=0;
        
        System.out.print("Ingresar String >> ");
        cadena=entrada.nextLine();
        cadena=cleanWord(cadena);
        
        for(int i=0;i<cadena.length();i++){
            if(Character.isWhitespace(cadena.charAt(i)))
                 cont++;
        }
        System.out.println("Palabras encontradas >> "+(cont+1));
        
    }
    private static String cleanWord(String word) {

		word = word.replace(",", ""); // ,
		word = word.replace(".", ""); // .
		word = word.replace(":", ""); // :
		word = word.replace("(", ""); // (
		word = word.replace(")", ""); // )
		word = word.replace("[", ""); // [
		word = word.replace("]", ""); // ]
		word = word.replace("-", ""); // -

		return word;
    }
}