package courses;

public class instanceVariable {
 int age=30;
 
 public void instanceVariable()
	{
		
		System.out.println("How old are you ? " + age);
	}
 
 public void instanceVariableAgain()
	{
		
		System.out.println("How old are you ? " + age);
	}
//InstanceObject Variable
  public static void main(String[] args) {
		instanceVariable objinstance = new instanceVariable();
		objinstance.instanceVariable();
		objinstance.instanceVariableAgain();

	}

}
