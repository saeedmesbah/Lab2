import java.util.*;
public class Colleg {
    
    private ArrayList<Professor> professor;
    private ArrayList<Lab> lab;
    private ArrayList<Student> student;
    private ArrayList<Class> clas;
    private int employee;
    
    public Colleg(int employee){
        this.employee=employee;
        professor=new ArrayList<Professor>();
        lab=new ArrayList<Lab>();
        clas=new ArrayList<Class>();
        student=new ArrayList<Student>();
    }
    
    public void print(){
        System.out.println("this Colleg has "+employee+" employees");
        System.out.println("  -  "+clas.size()+" Classes");
        System.out.println("  -  "+lab.size()+" Laboratories");
        System.out.println("  -  "+professor.size()+" Doctors");
        System.out.println(" and "+student.size()+" Students");
        System.out.println("");
        for(Student c:student){
            c.print();
        }
        
    }
    
    public void addProfessor(Professor professor){
        this.professor.add(professor);
    }
    
    public void addLab(Lab lab){
        this.lab.add(lab);
    }
    
    public void addClass(Class clas){
        this.clas.add(clas);
    }
    
    public void addStudent(Student student){
        this.student.add(student);
    }
    
    
}
