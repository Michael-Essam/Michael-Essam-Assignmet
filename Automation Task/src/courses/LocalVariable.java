package courses;

public class LocalVariable {
//Method1
	// Using Local Variable that iam using same variable in another Method
	public void LocalVariable()
	{
		int age = 23;
		System.out.println("How old are you ? " + age);
	}
	
	//Method2
	public void SameLocalVariable()
	{
		int age = 50;
		System.out.println("How old are you ? " + age);
	}
	
	//Parameter Variable
			public void Parametervariable(int age)
			{
				System.out.println("Michael has " + age + " Years Old.");
			}
	
	
	//Object
	public static void main(String[] args) {
		LocalVariable  TestClass = new LocalVariable();
		TestClass.LocalVariable();
		TestClass.SameLocalVariable();
		TestClass.Parametervariable(50);
		
	}
	
	
		
		
}
