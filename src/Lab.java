import java.util.*;
public class Lab {
    private ArrayList<Student> students;
    private int avg;
    private String name;
    private String day;
    private Professor pro;
    public Lab(String d,String day,Professor pro) {
        name=d;
        this.day=day;
        this.pro=pro;
        students=new ArrayList<Student>();
    }
    public void print() {
        System.out.println(name+" Lab");
        System.out.println("Professor: "+pro.getName());
        for(Student s:students){
            s.print();
        }
    }
    
    public void addStudents(Student students) {
        this.students.add(students);
    }
    
    public void calculateAvg() {
        int counter=0,sum=0;
      
        for(Student s:students){
            sum=sum+s.getGrade();
            counter++;
        }
        avg=sum/counter;
    }
    public int getAvg() {
        return avg;
    }
    
    public String getLabName() {
        return name;
    }
    
    public void setLabDay(String day) {
        this.name=day;
    }
    public String getLabDay(){
        return day;
    } 
}
