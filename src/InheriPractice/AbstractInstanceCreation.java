package InheriPractice;

public class AbstractInstanceCreation {
	
	//Project p1 = new Project();  // No we can not create instance of abstract class.

}

abstract class Project{
	
	public abstract void TestScrenarios();
	
	public void TestCases() {
		System.out.println("Project");
	}
}

