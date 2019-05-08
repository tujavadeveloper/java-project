public class Employee {
	protected String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static boolean isMarried() {
		return married;
	}

	public static void setMarried(boolean married) {
		Employee.married = married;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	protected int id;
	protected double Salary;
	protected int age;
	protected static boolean married;
	protected Job job;
	Employee(String name, int id, double Salary,int age, Job job) {
	this.name = name;
	this.id = id;
	this.Salary = Salary;
	this.age = age;
	this.job = job;
	}

	public void print() {
		System.out.println("id:" +id);
		System.out.println("name:" +name);
		System.out.println("Salary:" +Salary);
		System.out.println("age:" +age);
		System.out.println("job:" +job.name);
		
	}
}	
	


	
	
