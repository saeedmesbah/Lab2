
public class LAB2a2 {


    public static void main(String[] args) {
        
        // Students
        
        Student s1=new Student("man1","suf1", "9031066",18);
        Student s2=new Student("man2","suf2", "9031806",19);
        Student s3=new Student("man3","suf3", "9031054",17);
        Student s4=new Student("man4","suf4", "9031045",16);
        Student s5=new Student("adel","atri", "9031025",20);
        Student s6=new Student("man6","suf6", "9031044",17);
        Student s7=new Student("man7","suf7", "9031090",19);
        Student s8=new Student("man8","suf8", "9031012",18);
        Student s9=new Student("man9","suf9", "9031088",16);
        
        //Professores
        
        Professor p1=new Professor("Hossein","khaledy");
        Professor p2=new Professor("hassan ","mahmodi");
        
        
        // Labes
        
        Lab lab1=new Lab("AP","sunday",p1);
        Lab lab2=new Lab("DS","monday",p2);
        
        // adding students to the lab
        lab1.addStudents(s1);
        lab1.addStudents(s2);
        lab1.addStudents(s3);
        lab1.addStudents(s4);
        lab1.addStudents(s5);

        lab2.addStudents(s6);
        lab2.addStudents(s7);
        lab2.addStudents(s8);
        lab2.addStudents(s9);
        
        //Classes
        
        Class clas1=new Class(p2,"physics","wednesday");
        Class clas2=new Class(p1," math  "," tuseday ");
        
        //adding students to the class
        
        clas1.addStudent(s1);
        clas1.addStudent(s2);
        clas1.addStudent(s3);
        clas1.addStudent(s4);
        
        clas2.addStudent(s5);
        clas2.addStudent(s6);
        clas2.addStudent(s7);
        clas2.addStudent(s8);
        clas2.addStudent(s9);
        
        //adding classes and labes to professor
        
        p1.addClass(clas1);
        p1.addLab(lab2);
        
        p2.addClass(clas2);
        p2.addLab(lab1);
        
        // Colleg
        Colleg colleg=new Colleg(5);
        
        colleg.addClass(clas1);
        colleg.addClass(clas2);
        
        colleg.addLab(lab1);
        colleg.addLab(lab2);
        
        colleg.addProfessor(p1);
        colleg.addProfessor(p2);
        
        colleg.addStudent(s1);
        colleg.addStudent(s2);
        colleg.addStudent(s3);
        colleg.addStudent(s4);
        colleg.addStudent(s5);
        colleg.addStudent(s6);
        colleg.addStudent(s7);
        colleg.addStudent(s8);
        colleg.addStudent(s9);
        
        // Print
        
        //lab1.print();
        //lab2.print();
        //clas1.print();
        //clas2.print();
        //p1.print();
        //p2.print();
        colleg.print();
        
    }
    
}
