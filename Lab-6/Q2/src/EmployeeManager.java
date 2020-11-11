import java.util.Scanner;

public class EmployeeManager {
    private Employee[] employees;
    private int currentPos;
    public EmployeeManager(){
        employees = new Employee[10];
        currentPos = 0;
    }
    
    public boolean add(Employee employee){        
        if(currentPos + 1 < 10){
            employees[currentPos] = employee;
            currentPos++;
            return true;
        }
        return false;        
    }
    
    public boolean remove(String id) {        
        for(int i=0; i<currentPos; i++){
            if(employees[i].getId().equals(id)){
                for(int j=i+1; j<currentPos; j++){
                    employees[j-1] = employees[i];
                }
                currentPos--;
                return true;
            }
        }
        return false;
    }
    
     public boolean find(String id) {
        if(id.equals("null")){
            System.out.println("Error - id cannot be null.");
            return false;
        }
        for(int i=0; i<currentPos; i++){
            if(employees[i].getId().equals(id)) {                
                return true;
            }
        }
        return false;
    }
    
    public void display() {
        for(int i=0; i<currentPos; i++){
            System.out.println("id = "+employees[i].getId()+", full name = "+employees[i].getFullName() + ", salary = "+employees[i].getSalary());
        }
    }     
    public static void main(String[] args) {
        boolean q = false;
        Scanner sc = new Scanner(System.in);
        EmployeeManager em = new EmployeeManager();
        
        while(!q){            
            System.out.println("1. Insert\n2. Remove\n3. Report\n4. Display\n5. Quit:");            
            System.out.println("Enter choice number:");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:{
                    System.out.println("Enter id:");
                    String id = sc.next();
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter salary:");
                    int salary = sc.nextInt();
                    if (em.add(new Employee(id, name, salary))) {
                        System.out.println("Employee added");
                    }else{
                        System.out.println("Employee not added");
                    }
                }break;
                case 2:{
                    System.out.println("Enter id:");
                    String id = sc.next();                    
                    if (em.remove(id)) {
                        System.out.println("Employee removed");
                    }else{
                        System.out.println("Employee not found");
                    }                    
                }break;
                case 3:{
                    System.out.println("Enter id:");
                    String id = sc.next();                    
                    if (em.find(id)) {
                        System.out.println("Employee found");
                    }else{
                        System.out.println("Employee not found");
                    }                    
                }break;
                case 4:{
                    em.display();
                }break;
                case 5:{
                    q=true;
                }break;
                default:
                    System.out.println("Invalid!");
            }
        }   
    }
    
}
