package pack1;

import org.testng.TestNG;

public class Executablejar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestNG testng = new TestNG();
	     Class[] classes = new Class[]{Testclass.class};
	     testng.setTestClasses(classes);
	     testng.run();

	}
	

}
