import java.util.*;
public class Professor {
    private ArrayList<Lab> lab;
    private ArrayList<Class> clas;
    private String lastName;
    private String firstName;
    
    public Professor(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        clas=new ArrayList<Class>();
        lab=new ArrayList<Lab>();
        
    }
    
    public void addClass(Class clas){
        this.clas.add(clas);
    }
    
    public void addLab(Lab lab){
        this.lab.add(lab);
    }
    
    public String getName(){
        return "Dr."+lastName;
    }
    
    
    public void print(){
        System.out.println("Dr."+firstName+" "+lastName);
        System.out.println("Classes: ");
        for(Class c:clas){
            System.out.print("Name: "+c.getClassName()+" - Day: "+c.getClassDay()+"\t");
        }
        System.out.println("");
        System.out.println("Laboratories: ");
        for(Lab l:lab){
            System.out.print("Name: "+l.getLabName()+" - Day: "+l.getLabDay()+"\t");
        }
        System.out.println("");
        
    }
    
}
