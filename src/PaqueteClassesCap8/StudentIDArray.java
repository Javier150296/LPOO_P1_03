package PaqueteClassesCap8;


import java.util.Scanner;

public class StudentIDArray {
    private int id;
    private String nombre;
    private double prom;

    public void setProm(double prom) {
        this.prom = prom;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getProm() {
        return prom;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return this.id;
    }

    public StudentIDArray(int id, String nombre, double prom) {
        this.id = id;
        this.nombre = nombre;
        this.prom = prom;
    }

    public static void  ejecutar() {
        Arreglo a = new Arreglo();
        a.add(1234, "juan daniel cruz aguilar", 9.2, 0);
        a.add(2354, "glenn nieblas herandez", 6.5, 1);
        a.add(6578, "darwin diaz simon", 6.8, 3);
        a.add(7582, "karen valasco", 10.0, 3);
        a.add(1236, "juan daniel cruz aguilar", 9.2, 4);
        a.add(2358, "glenn nieblas herandez", 6.5, 5);
        a.add(6574, "darwin diaz simon", 6.8, 6);
        a.add(7581, "karen valasco", 10.0, 7);
        do{
        }while(a.buscar()==0);
       
        
    }
    
}


