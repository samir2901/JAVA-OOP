
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College Name: ");        
        String cllgName = sc.nextLine();              
        
        Student.setCollegeName(cllgName);
        
        Student.setRollNo();        
        Student student1 = new Student("John");
        student1.getStudentInfo();      
        
        Student.setRollNo();        
        Student student2 = new Student("Sam");
        student2.getStudentInfo();           
   
    }
}
