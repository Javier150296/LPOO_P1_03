
package PaqueteClassesCap8;

import java.util.Scanner;

/**
 *
 * @author JAVIER1
 */
public class Arreglo {
    int id;
    Scanner datos  = new Scanner(System.in);
    StudentIDArray[] s = new StudentIDArray[10];
    
    public void add(int id, String nom, double pro, Integer i){
        s[i]=new StudentIDArray(id, nom, pro);
    }
    
    public int buscar(){
        int ban =0, apu=0;
        System.out.println("id: ");
        id = datos.nextInt();
        for(int i=0;i<8;i++){
            if((s[apu].getId())==id){
                System.out.println("nombre : " + s[i].getNombre()+ "     promedio: "+ s[i].getProm());
                ban=1;
                apu++;
            } 
        }
        return ban;
    }
}
