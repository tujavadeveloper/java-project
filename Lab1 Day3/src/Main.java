import java.util.ArrayList;
import java.util.Iterator;

public class Main {

public static void main(String args[]) {
	Job job1 = new Job(1, "HR");
	Job job2 = new Job(2, "BA");
	Job job3 = new Job(3, "Tester");
	Job job4 = new Job(4, "Developer");
	Job job5 = new Job(5, "CEO");
	Employee employee1 = new Employee("Nguyen Van A",1,3000,25,job1);
	Employee employee2 = new Employee("Nguyen Van B",2,4000,25,job2);
	Employee employee3 = new Employee("Nguyen Van C",3,5000,25,job3);
	Employee employee4 = new Employee("Nguyen Van D",4,6000,25,job4);
	Employee employee5 = new Employee("Nguyen Van E",5,7000,25,job5);
	ArrayList<Employee> employees = new ArrayList<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	employees.add(employee3);
	employees.add(employee4);
	employees.add(employee5);		
	System.out.println("Mang co :" + employees.size()+  "phan tu");
	System.out.println("............Thong tin employee..........");
	System.out.println("ID name        Salary     Job name");
     for(Employee employee : employees) {
    	 System.out.println(employee.getId() + "    " + employee.getName()+"         "+employee.getAge()+"    "+employee.getSalary()+"        "+employee.getJob());
     }
     Iterator<Employee> itr = employees.iterator();
     while (itr.hasNext()) {
    	 Employee item=itr.next();
    	 System.out.println(item.getId() + "    " + item.getName()+"         "+item.getAge()+"    "+item.getSalary()+"        "+item.getJob());
    	 
     }
 }   
}
