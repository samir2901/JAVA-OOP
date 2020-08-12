import java.util.Scanner;

public class Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter Merit: ");
		int merit = sc.nextInt();
		sc.close();
		if(salary>=500 && salary<600){
			System.out.println("Salary : $" + salary + " Merit : " + merit + " - Grade C");
		}
		if(salary>=600 && salary<700){
			if(salary<649 && merit<10){
				System.out.println("Salary : $" + salary + " Merit : " + merit + " - Grade C");
			}
			else{
				System.out.println("Salary : $" + salary + " Merit : " + merit + " - Grade B");
			}
		}
		else if(salary>=700 && salary<899){
			if(salary<799 && merit<20){
				System.out.println("Salary : $" + salary + " Merit : " + merit + " - Grade B");
			}
			else{
				System.out.println("Salary : $" + salary + " Merit : " + merit + " - Grade A");
			}
		}
	}
}