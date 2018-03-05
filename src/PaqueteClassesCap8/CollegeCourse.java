package PaqueteClassesCap8;

public class CollegeCourse {
    private String id;
    private Integer creditos;
    private String calif;
    private Character grade;
    
    public CollegeCourse(){
        
    }
    public CollegeCourse(String id, Integer creditos, String calif ){
        this.id=id;
        this.creditos=creditos;
        this.calif=calif;
        
    }
    
    public void setCourseID(String id){
        this.id=id;
    }
    public String getCourseID(){
        return this.id;
    }
    
    public void setCreditHours(Integer creditos){
        this.creditos=creditos;
    }
    
    public void setCalif(String calif){
        this.calif=calif;
    }
    
    public String getId(){
        return this.id;
    }
    
    public Integer getCreditos(){
        return this.creditos;
    }
    
    public String getCalif(){
        return this.calif;
    }
    
    public void setLetterGrade(Character grade){
        this.grade=grade;
    }
    
    public Character getLetterGrade(){
        return this.grade;
    }
}