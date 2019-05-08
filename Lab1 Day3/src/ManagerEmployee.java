

import java.util.Scanner;


public class ManagerEmployee {
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	public static Employee[] employees;
	public static boolean isEndProgram = false;
	private static Scanner scannerName;
	public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	
	public static void showMenu() {
		do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: exit");
			System.out.println("4: Search employee by name");
			System.out.println("5: updateEmployeeByName");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				addEmployee();
				askForContinue();
				break;
			case 2:
				if (employees != null && employees.length > 0) {
					showEmployee();
				} else {
					System.out.println("Please add new employee first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Please input name to search:");
				String nameInput = scanner.next();
				Employee employee = searchEmployeeByName(nameInput);
//tao ra 1 doi tuong employee de lay ket qua tra ve...vi ham` return ve` gtri employee.
				System.out.println("-----Thong tin tim kiem------");
				System.out.println(employee.getId() + " " + employee.getName() + "	 " + employee.getSalary());
				askForContinue();
			case 5:
				System.out.println("Please input name to update salary");
				String nameInputUpdate = scanner.next();
				System.out.println("NewSalary : ");
				double newSalary = scanner.nextDouble();
				//contains la ham lay 1 ki tu trong 1 chuoi ki tu
				//vi du nhap ten Thanh thi` van~ in ra day` du? thong tin cua Nguyen Tan Thanh
				String fullname = "Nguyen Tan Thanh";
				if(fullname.contains(nameInputUpdate)) {
					//do something
				}	
				updateEmployeeByName(nameInputUpdate, newSalary);
				askForContinue();
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 3);
	}
	
	public static void addEmployee() {
		System.out.println("How many employee you want to create? : ");
		employeeNo = scanner.nextInt();
		employees = new Employee[employeeNo];
		for (int i = 0; i < employeeNo; i++) {
			System.out.println("Please input the information of employee[" + i + 1 + "] : ");
			System.out.println("Name : ");
			scannerName = new Scanner(System.in);
			String name = scannerName.nextLine();
			System.out.println("Salary : ");
			double Salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			Employee employee = new Employee(name, i + 1 , (int) Salary, age ,  new Job(i + 1, jobName));
			employees[i] = employee;
		}
	}
	
	public static void showEmployee() {
		System.out.println("----------------List of employee-----------");
		System.out.println("ID Name     Salary    Job name");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getId() + " " + employees[i].getName() + "   " + employees[i].getSalary() + " " + employees[i].getJob());
		}
	}
	public static Employee searchEmployeeByName(String nameInput) {
		Employee employee = null;
		for(int i = 0; i < employees.length; i++) {
			if(nameInput.equals(employees[i].getName())) { //equal la so sanh 
				employee = employees[i];
				break;
			}
		}
		return employee;
	}
	
	
	public static void updateEmployeeByName(String nameInputUpdate, double newSalary) {
		for(int i = 0; i < employees.length; i++) {
			if(nameInputUpdate.equals(employees[i].getName())) { //equal la so sanh 
				employees[i].getSalary();
				break;
			}
		}
	}
	
	public static void askForContinue() {
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
	}
	
	// TODO : cac ban lam tiep bai tap nay
	// 4. Tim kiem nhan vien theo ten. Vd : searchEmployeeByName("Loc"); -> List danh sach tat ca nhan vien ten Loc
	// 5. Cap nhat lai luong nhan vien theo ten. Vd : updateEmployee("Loc", 2000) -> tat ca employee ten Loc se co salary 2000
}