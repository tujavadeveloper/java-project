public class Main {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle("red", 10, 5);
		System.out.println("Mau sac tam giac : " + triangle1.getColor());
		System.out.println("Dien tich tam  giac : " + triangle1.getArea());
		Rectangle rectangle = new Rectangle("blue", 10, 5);
		System.out.println("Mau sac tam giac : " + rectangle.getColor());
		System.out.println("Dien tich hinh chu nhat : " + rectangle.getArea());
	}

}