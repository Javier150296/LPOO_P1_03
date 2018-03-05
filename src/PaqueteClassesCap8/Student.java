package PaqueteClassesCap8;

public class Student {
    private Integer nid;
    private CollegeCourse[] c = new CollegeCourse[5];
    private int i=0;
    public void setStudentID(Integer nid){
        this.nid=nid;
    }
    
    public Integer getStudentID(){
        return this.nid;
    }
    
    public CollegeCourse getCursos(Integer i){
        return c[i];
    }
    
    public void setCursos(String id, Integer creditos, String calif, Integer pos){
        c[pos]= new CollegeCourse(id, creditos, calif);
    }
    public void setCourse(CollegeCourse course, Integer pos){
        c[pos]=new CollegeCourse(course.getId(),course.getCreditos(),course.getCalif());
    }
    
    public static void  ejecutar() {
        // TODO code application logic here
        Student s = new Student();
        s.setStudentID(014405024);
        s.setCursos("CIS210", 3, "A", 0);
        s.setCursos("CIS211", 3, "A", 1);
        s.setCursos("CIS212", 5, "D", 2);
        s.setCursos("CIS213", 6, "F", 3);
        s.setCursos("CIS214", 3, "A", 4);
        
        System.out.println("alumno: "+s.getStudentID());
        System.out.println("Cursos: ");
        for(int i=0;i<5;i++){
            System.out.println(s.getCursos(i).getId()+"  "+s.getCursos(i).getCreditos()+"  "+ s.getCursos(i).getCalif());
        }
        
        s.setCursos("LISA202", 6, "F", 0);
        System.out.println("curso modificado:");
        for(int i=0;i<5;i++){
            System.out.println(s.getCursos(i).getId()+"  "+s.getCursos(i).getCreditos()+"  "+ s.getCursos(i).getCalif());
        }
    }
    
}
