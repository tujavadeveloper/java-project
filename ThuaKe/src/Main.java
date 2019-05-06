public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("kiki", 3, "dog");
		System.out.println("Name of " + dog.getTypeAnimal() + " : " + dog.getName());
		System.out.println("Age of " + dog.getTypeAnimal() + " : " + dog.getAge());
		Tiger tiger = new Tiger("Gugu", 10, "tiger");
		System.out.println("Name of " +tiger.getTypeAnimal() + " : " + tiger.getName());
		System.out.println("Age of " + tiger.getTypeAnimal() + " : "  +tiger.getAge());
	}
}
