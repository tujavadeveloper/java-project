/**
 * 
 */
package Student;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Student {
	private String Name, Age;
	private String Gender;
	public void nhap() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Name : ");;
	 Name = scanner.nextLine();
	 System.out.println("Age : ");
	 Age = scanner.nextLine();
	 System.out.println("Gender : ");
	 Gender = scanner.nextLine();
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		student1.nhap();
		student2.nhap();
		student3.nhap();
		System.out.println(student1.Name +" "+ student1.Age +" "+ student1.Gender);
		System.out.println(student2.Name +" "+ student2.Age +" "+ student2.Gender);
		System.out.println(student3.Name +" "+ student3.Age +" "+ student3.Gender);
		

	}

}
