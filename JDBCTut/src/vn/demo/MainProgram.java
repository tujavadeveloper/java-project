package vn.demo;
import vn.demo.dao.NewsDAOImpl;
public class MainProgram {
	public static int inputNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsDAOImpl display=new NewsDAOImpl();
		display.menu();
		System.out.println("The Program End ");
	}

}