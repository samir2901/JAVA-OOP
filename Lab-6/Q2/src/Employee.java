public class Employee {
    private String id;
    private String fullName;
    private int salary;
    public Employee(String id, String fullName, int salary){
     this.id = id;
     this.fullName = fullName;
     this.salary = salary;
    }    
    public String getId(){
        return this.id;
    }
    public String getFullName(){
        return this.fullName;
    }
    public int getSalary(){
        return this.salary;
    }
}
