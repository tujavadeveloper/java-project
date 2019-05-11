import java.util.*;

public class ManagerEmployeeCollection implements ManagerEmployee {
	public static int inputNumber;
	public static Scanner input = new Scanner(System.in);
	ArrayList<Employee> empArr=new ArrayList<>();
	public static int empNo;
	public static boolean isEndProgram = false;

	public static void main(String[] args) {
		showMenu();
		System.out.println("Ket thuc chuong trinh  ");
	}
	
	private static void showMenu() {		
		ManagerEmployeeCollection list=new ManagerEmployeeCollection();
		do {		
			System.out.println("1: Tao nhan vien");
			System.out.println("2: Hien thi nhan vien hien co");
			System.out.println("3: Tim kiem nhan vien hien co");
			System.out.println("4: Cap nhat nhan vien hien co");
			System.out.println("5: Thoat");
			System.out.println("--------------------------------------");
			System.out.println("Chon so !");
			inputNumber = input.nextInt();
			
			switch (inputNumber) {
			case 1: 
				
				list.addEmp();
				askForContinues();
				break;
			case 2: 
				list.showEmp();
				askForContinues();
				break;
			case 3: 
				System.out.println("Nhap ten can tim kiem! ");
				String nameInp = input.next();
				Employee employee = list.findEmp(nameInp);
				System.out.println("Infor Emp");
				System.out.println(employee);
				String fullname = "To Anh Tu";
				 if(fullname.toLowerCase().contains(nameInp.toLowerCase())) {
					 System.out.println("ok");
				 }
				 
				 
				 
				askForContinues();
				break;
			case 4: 
				System.out.println("cap nhat ten va luong");
				String nameUp = input.next();
				double salaryUp = input.nextDouble();				
				list.updateEmp(nameUp,salaryUp);
				System.out.println();
				askForContinues();
			case 5:
				break;
			default:
				System.out.println(" NHAP SAI , VUI LONG THU LAI!!1 ");
				break;
			}
		} while (inputNumber != 5);

	}

	public static void askForContinues() {
		System.out.println("Ban co muon tiep tuc? (Nhan 5 de ket thuc, 0 de quy lai menu) : ");
		int inputNo = input.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 5:
			isEndProgram = true;
			break;
		default:
			break;
		}

	}


	public void addEmp() {
		System.out.println("Ban muon tao bao nhieu?");
		empNo = input.nextInt();
		for (int i = 0; i < empNo; i++) {
			System.out.println("Name emp: ");
			String name = input.next();
			System.out.println("salary emp: ");
			double salary = input.nextDouble();
			System.out.println("Age emp: ");
			Integer age = input.nextInt();
			System.out.println("jobName emp: ");
			String jobName = input.next();
			System.out.println("Married emp: ");
			boolean Married = input.nextBoolean();
			Employee empObj = new Employee(name, i + 1, salary, age, Married, new Job(i + 1, jobName));
			empArr.add(empObj);

		}
	}

	public void updateEmp(String nameUp, double salaryUp) {
		System.out.println("Nhap ten va muc luong su dung de cap nhat ! ");
		for (Employee employee : empArr) {
			if(nameUp.equals(employee.getName())){
				employee.setSalary(salaryUp);
			}
		}
	}

	@Override
	public Employee findEmp(String nameInp) {
		
		
		Employee employee = null;
		for (int i = 0; i < empArr.size(); i++) {
			if(nameInp.equals(empArr.get(i).getName())) {
				employee=empArr.get(i);
				break;
			}
		}
		
		return employee;
	}

	@Override
	public void showEmp() {
		
		
		for (Employee employee : empArr) {
			System.out.println(employee.toString());
		}
		
	}
	
}