/**
 * 
 */
package Dog;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Dog {
	private String color,name,breed;
	private Scanner scanner;
	public void nhap() {
		scanner = new Scanner(System.in);
		System.out.println("Nhap thong tin : ");
		System.out.println("color : ");
		color = scanner.nextLine();
		System.out.println("name : ");
		name = scanner.nextLine();
		System.out.println("breed : ");
		breed = scanner.nextLine();	
	}
	void barking() {
		System.out.println(this.name +" "+ this.color+" "+ this.breed+" "+ "meo meo");
	}
	void waggingthetail() {
		System.out.println(this.name +" "+ this.color+" "+ this.breed+" "+ "lắc mông");
	}
	void eating() {
		System.out.println(this.name +" "+ this.color+" "+ this.breed+" "+ "ăn gà");
	}
	
	public static void main(String[] args) {
		Dog Dog1 = new Dog();Dog1.nhap();
		Dog Dog2 = new Dog();Dog2.nhap();
		Dog Dog3 = new Dog();Dog3.nhap();
		
		Dog1.barking();
		Dog2.eating();
		Dog3.waggingthetail();
	}
}



 
	  	  
	  