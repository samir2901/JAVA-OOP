public class Student {    
        String name;
        static int rollNo=0;
        static String collegeName;
        static int counter=1;
        
        public Student(String name) {
            this.name = name;            
        }

        public static void setRollNo() {
            Student.rollNo += Student.counter;
        }

        public static void setCollegeName(String collegeName) {
            Student.collegeName = collegeName;
        }      
        
        public void getStudentInfo(){
            System.out.println("Name:"+this.name);
            System.out.println("Roll No:"+rollNo);
            System.out.println("College Name:"+collegeName);
        }
}
