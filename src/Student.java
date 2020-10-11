
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;
    
    public Student(String firstName,String lastName,String id,int grade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.grade=grade;
    }
    
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public String getID(){
        return id;
    }
    
    public void print(){
        System.out.println("Name: "+firstName+"  "+ lastName+", student ID: "+id+", grade: "+grade);
    }
    
    
}
