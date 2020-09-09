/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samiruddin Thunder
 */
class Person {
    public String hobby;
    private String name;
    
    public Person(String name){
        this.name = name;                
        this.hobby = "reading";
    }    
    
    public String getName(){
        return this.name;
    }
    
    public void introduce(){
        System.out.println("Hello, my name is " + this.name + " and my hobby is " + this.hobby);
    }
}

class Student extends Person{
    public Student(String name){
        super(name);
        super.hobby = "facebook";
    }     
    
}

class CSEStudent extends Student{
    public CSEStudent(String name){
        super(name);
        super.hobby = "hacking";
    }         
}
