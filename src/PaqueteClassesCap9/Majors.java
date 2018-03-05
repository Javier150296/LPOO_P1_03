package PaqueteClassesCap9;



import java.util.Scanner;

public class Majors {
	
	public static void ejecutar() {
		
		String materia;

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter Major: ");

		for (majors maj: majors.values()){
			System.out.println(maj);		
		}
		materia=scanner.nextLine();
		switch (materia){
			case "ACC":
			case "CIS":
			System.out.println("Esta materia cae en la división empresarial");
			break;
			case"CHEM":
			case"PHYS":
			System.out.println("Esta materia cae en la división de ciencias");
			break;
			case"ENG":
			case"HIS":
			System.out.println("Esta materia cae en la división de humanidades");
			break;
			default:
			System.out.println("Esta NO es una materia");
		}
		scanner.close();
	}
}
enum majors{ACC, CHEM, CIS, ENG, HIS, PHYS}