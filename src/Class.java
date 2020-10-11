import java.util.*;
public class Class {
    private ArrayList<Student> student;
    private Professor professor;
    private String name;
    private String day;
    
    public Class(Professor professor,String name,String day){
        this.name=name;
        this.professor=professor;
        this.day=day;
        student=new ArrayList<Student>();
    }
    
    public void addStudent(Student student){
        this.student.add(student);
    }
    
    public String getClassName(){
        return name;
    }
    
    public String getClassDay(){
        return day;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public void print(){
        System.out.println("Class: "+name);
        System.out.println("Professor: "+professor.getName());
        for(Student s:student){
            System.out.println("First Name: "+s.getFirstName()+" - Last Name: "+s.getLastName()+" - ID: "+s.getID());
        }
    }
}
