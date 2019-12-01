package Localvariables;

public class TestlocalVariable {
	
	//Method#1
	public void testlocalVariables()
	{
		int age= 35 ; 
		System.out.println("How old are you? " + age);
	}

	//Method#2
		public void testsamelocalVariables()
		{
			int age= 35 ; 
			System.out.println("How old are you? " + age);
		}

	//Object
	public static void main(String[] args) {
		TestlocalVariable testclass = new TestlocalVariable();
		testclass.testlocalVariables();
		testclass.testsamelocalVariables();

	}
	

	

}
